package com.csu.ohio.student.service;

import com.csu.ohio.student.bean.LoginBean;

public interface LoginService {
	//LoginBean findLoginDetails(String username);

	LoginBean findLoginDetails(LoginBean loginbean);
}
