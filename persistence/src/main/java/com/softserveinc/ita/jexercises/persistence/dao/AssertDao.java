package com.softserveinc.ita.jexercises.persistence.dao;

import java.util.List;

import com.softserveinc.ita.jexercises.common.entity.Assert;

public interface AssertDao extends GenericDao<Assert, Long> {

	public List<Assert> findAllByQuestion(Long questionId); 
}