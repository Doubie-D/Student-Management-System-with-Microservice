package com.csu.ohio.student.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.csu.ohio.student.bean.LoginBean;
import com.csu.ohio.student.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginservice;
	
	@RequestMapping(value="/login.html")
	public ModelAndView loadLognPageHtml() {
		return new ModelAndView("login", "loginBean", new LoginBean());
	}
	
	
	@RequestMapping(value="/validateLogin.html",method = RequestMethod.POST)
	  public ModelAndView findLogin(LoginBean loginbean) {
	  ModelAndView mv=new ModelAndView();
	  LoginBean bean= loginservice.findLoginDetails(loginbean);
	  
	  if(bean!=null) {
		  mv.setViewName("home");
	  }else {	  
	  mv.setViewName("login");
	  mv.addObject("errormessage", "Invalid Credentials");
	  }
	  return mv;
	}
}
