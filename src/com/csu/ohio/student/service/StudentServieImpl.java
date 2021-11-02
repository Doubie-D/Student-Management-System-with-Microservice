package com.csu.ohio.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csu.ohio.student.bean.StudentBean;
import com.csu.ohio.student.dao.StudentDAOWrapper;
@Service
public class StudentServieImpl implements StudentService
{
	@Autowired
	StudentDAOWrapper daowrapper;

	@Override
	public void addStudent(StudentBean bean) 
	{
		daowrapper.addStudent(bean);
		
	}

	@Override
	public void displayStudent(StudentBean bean) {
		daowrapper.displayStudent(bean);
	}
	

}
