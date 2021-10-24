package com.csu.ohio.student.service;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csu.ohio.student.bean.LoginBean;
import com.csu.ohio.student.dao.LoginDAO;
import com.csu.ohio.student.dao.LoginDAOImpl;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO logindao;
	
	
	@Override
	public LoginBean findLoginDetails(LoginBean loginbean) {
		
		return logindao.findLoginDetails(loginbean);
		
		
	}

}
