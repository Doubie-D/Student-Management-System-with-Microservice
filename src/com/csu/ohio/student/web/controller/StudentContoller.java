package com.csu.ohio.student.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.csu.ohio.student.bean.StudentBean;
import com.csu.ohio.student.service.StudentServieImpl;

@Controller
public class StudentContoller 
{
	@Autowired
	StudentServieImpl serviceimpl;
	//@RequestMapping(value = "addCustomer.html" ,method = RequestMethod.GET)
	@RequestMapping("addStudent.html")
	public ModelAndView display(ModelMap map)
	{
		System.out.println("i");
		StudentBean bean= new StudentBean();
		System.out.println("j");
		map.addAttribute("bean",bean);
		ModelAndView mv=new ModelAndView("custadd");
		System.out.println("k");
		return mv;
	}

	@RequestMapping(value="process.html",method = RequestMethod.POST)
	public ModelAndView process(@ModelAttribute("bean") StudentBean bean)
	{
		serviceimpl.addStudent(bean);
		ModelAndView mv = new ModelAndView("success");
		return mv;
	}
}
