package com.csu.ohio.student.service;

import com.csu.ohio.student.bean.RegisterBean;

public interface RegisterService {
	
	public void registerStudent(RegisterBean bean);
	
	public void displayRegisteredStudent(RegisterBean bean);
}
