package com.softserveinc.ita.jexercises.business.services;

import java.util.List;

import org.springframework.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.softserveinc.ita.jexercises.common.entity.Assert;
import com.softserveinc.ita.jexercises.persistence.dao.impl.AssertDao;

/**
 * Represent AssertService interface implemetation.
 * 
 * @author Kucheryavenko Dmytro
 *
 * @version 1.0
 */
@Service
public class AssertServiceImpl implements AssertService {

    /**
     * AssertDao instance.
     */
    @Autowired
    private AssertDao assertDao;

    @Override
    @Transactional
    public void createAssert(Assert assertVar) {
        assertDao.create(assertVar);

    }

    @Override
    @Transactional
    public void deleteAssert(Assert assertVar) {
        assertDao.delete(assertVar);

    }

    @Override
    @Transactional
    public void deleteAssertById(Long id) {
        assertDao.deleteById(id);

    }

    @Override
    @Transactional
    public Assert updateAssert(Assert assertVar) {

        return assertDao.update(assertVar);
    }

    @Override
    public Assert findAssertById(Long id) {
        return assertDao.findById(id);
    }

    @Override
    public List<Assert> findAllAsserts() {
        return assertDao.findAll();
    }

    @Override
    public List<Assert> findAllByQuestionId(Long questionId) {
        return assertDao.findAllByQuestion(questionId);
    }

}
