package com.softserveinc.ita.jexercises.persistence.dao.impl.hibernate;

import com.softserveinc.ita.jexercises.common.entity.Question;
import com.softserveinc.ita.jexercises.persistence.dao.impl.QuestionDao;

import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

/**
 * Represents Hibernate Question DAO implementation.
 *
 * @author Volodymyr Yakymiv
 * @version 1.0
 */
@Repository
public class HibernateQuestionDaoImpl extends
        HibernateGenericDaoImpl<Question, Long>
        implements QuestionDao {

    @Override
    public List<Question> findAllByTestId(Long testId) {
        try {
            String squerty = "select distinct q from Question q " +
                    "INNER JOIN q.tests t where t.id=:testId";
            Query q = getEntityManager().createQuery(squerty);
            q.setParameter("testId", testId);
            List<Question> questions = (List<Question>) q.getResultList();
            return questions;
        } catch (NoResultException e) {
            return null;
        }
    }
}
