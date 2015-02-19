package com.softserveinc.ita.jexercises.common.dto;

/**
 * DTO for test result page.
 *
 * @author Volodymyr Lishchynski
 * @version 1.0
 */
public class TestResultAnswerDto {

    /**
     * Description of question.
     */
    private String questionDescription;

    /**
     * Is user answer correct or incorrect.
     */
    private boolean isCorrect;

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
}