package com.csu.ohio.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csu.ohio.student.bean.LoginBean;

public interface LoginDAO  {
	LoginBean findLoginDetails(LoginBean loginbean);
	
}
