package com.csu.ohio.student.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.csu.ohio.student.bean.LoginBean;
import com.csu.ohio.student.entity.LoginEntity;

@Repository
public class LoginDAOImpl implements LoginDAO {
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public LoginBean findLoginDetails(LoginBean loginbean) {
		LoginBean bean=null;
		LoginEntity loginEntity=entityManager.find(LoginEntity.class, loginbean.getUserName());
		if(loginEntity!=null) {		
			if(loginbean.getPassword().equals(loginEntity.getPassword())) {
				bean=new LoginBean();
				BeanUtils.copyProperties(loginEntity, bean);
			}
		
		}
		return bean;
	}
}
