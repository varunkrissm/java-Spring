package com.mytest.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.mytest.dao.UploadDao;
import com.mytest.model.UploadDetails;

@Repository
public class UploadDaoImpl implements UploadDao {

	@PersistenceContext
    private EntityManager entityManager;
	
	public List<UploadDetails> getUploadDetails() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(UploadDetails.class);
		return criteria.list();
	}

}
