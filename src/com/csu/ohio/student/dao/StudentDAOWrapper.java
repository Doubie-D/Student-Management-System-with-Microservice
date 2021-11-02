package com.csu.ohio.student.dao;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.csu.ohio.student.bean.StudentBean;
import com.csu.ohio.student.entity.StudentEntity;

@Repository
public class StudentDAOWrapper 
{
	@Autowired
	StudentDAO studentdao;
	
	@Transactional("txManager")
	public void addStudent(StudentBean bean)
	{
		StudentEntity en = new StudentEntity();
		BeanUtils.copyProperties(bean, en);
		studentdao.save(en);
	}
	
	@Transactional("txManager")
	public void displayStudent(StudentBean bean) {
		StudentEntity en = new StudentEntity();
		BeanUtils.copyProperties(bean, en);
		studentdao.save(en);
	}

}
