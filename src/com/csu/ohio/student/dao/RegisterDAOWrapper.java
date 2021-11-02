package com.csu.ohio.student.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.csu.ohio.student.bean.RegisterBean;
import com.csu.ohio.student.bean.StudentBean;
import com.csu.ohio.student.entity.RegisterEntity;

@Repository
public class RegisterDAOWrapper {
	@Autowired
	RegisterDAO registerdao;
	
	@Transactional("txManager")
	public void registerStudent(RegisterBean bean)
	{
		RegisterEntity en = new RegisterEntity();
		BeanUtils.copyProperties(bean, en);
		registerdao.save(en);
	}
	
	@Transactional("txManager")
	public void displayRegisteredStudent(RegisterBean bean) {
		RegisterEntity en = new RegisterEntity();
		BeanUtils.copyProperties(bean, en);
		registerdao.save(en);
	}
}
