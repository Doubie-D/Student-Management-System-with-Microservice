package com.csu.ohio.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csu.ohio.student.bean.RegisterBean;
import com.csu.ohio.student.dao.RegisterDAOWrapper;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	RegisterDAOWrapper daowrapper;

	@Override
	public void registerStudent(RegisterBean bean) {
		daowrapper.registerStudent(bean);
	}

	@Override
	public void displayRegisteredStudent(RegisterBean bean) {
		daowrapper.displayRegisteredStudent(bean);
	}

}
