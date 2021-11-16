package com.csu.ohio.student.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.csu.ohio.student.bean.RegisterBean;
import com.csu.ohio.student.service.RegisterServiceImpl;

@Controller
public class RegisterController {
	@Autowired
	RegisterServiceImpl serviceimpl;
	
	@RequestMapping("registerStudent.html")
	public ModelAndView display(ModelMap map)
	{
		System.out.println("i");
		RegisterBean bean= new RegisterBean();
		System.out.println("j");
		map.addAttribute("bean",bean);
		ModelAndView mv=new ModelAndView("register");
		System.out.println("k");
		return mv;
	}

	@RequestMapping(value="process1.html",method = RequestMethod.POST)
	public ModelAndView process(@ModelAttribute("bean") RegisterBean bean)
	{
		serviceimpl.registerStudent(bean);
		ModelAndView mv = new ModelAndView("success1");
		return mv;
	}
	
	@RequestMapping(value="studentInformation.html", method = RequestMethod.GET )
	public String doGet(HttpServletRequest request, HttpServletResponse response, ServletResponse res) throws ServletException, IOException {
		
		 
		return "StudentInformation";
	}
}
