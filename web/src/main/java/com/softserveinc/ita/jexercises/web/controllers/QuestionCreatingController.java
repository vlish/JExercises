package com.softserveinc.ita.jexercises.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.softserveinc.ita.jexercises.business.services.
        QuestionCreatingService;
import com.softserveinc.ita.jexercises.common.dto.QuestionCreatingDto;

/**
 * Class which includes CreateQuestionController.
 * 
 * @author Kucheryavenko Dmytro
 *
 * @version 1.0
 */
@Controller
public class QuestionCreatingController {
    /**
     * Service handles question creating process.
     */
    @Autowired
    private QuestionCreatingService questionCreatingService;

    /**
     * Gets Question Creating page.
     * 
     * @param model
     *            Model object.
     * @return questioncreating.jsp
     */
    @RequestMapping(value = "/questioncreating", method = RequestMethod.GET)
    public ModelAndView showCreateQuestionForm(Model model) {
        return new ModelAndView("questioncreating");
    }

    /**
     * Method calls service-methods to create tables in database.
     * 
     * @param questionCreatingDto
     *            QuestionCreatingDto object.
     */
    @RequestMapping(value = "/questioncreating", method = RequestMethod.POST)
    public void registerNewQuestion(
            @RequestBody QuestionCreatingDto questionCreatingDto) {
        questionCreatingService.createQuestionDescription(questionCreatingDto);

    }
}
