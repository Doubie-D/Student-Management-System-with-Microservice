package com.csu.ohio.student.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.csu.ohio.student.bean.SemesterBean;
import com.csu.ohio.student.bean.SemesterWiseFeePaidReportBean;
import com.csu.ohio.student.exceptions.MicroServiceException;
import com.csu.ohio.student.service.ReportsService;
import com.csu.ohio.student.web.client.SemesterServiceConsumption;

@Controller
@SessionAttributes({"semesterWiseFeePaidReportBean","semesterWiseFeePaidBeanList","semesterBean"})
public class ReportsController {

	//private static Logger LOGGER = Logger.getLogger(ReportsController.class);

	@Autowired
	private ReportsService reportsService;

	@Autowired
	private SemesterServiceConsumption semesterServiceConsumption;
	
	List <SemesterBean> semesterIdList;


	
	@RequestMapping("loadSemesterWiseFeePaidReportPage.html")
	public ModelAndView showSemesterWiseFeePaidReportPage(HttpSession session) {
		
		session.setAttribute("semesterWiseFeePaidBeanList", new ArrayList<SemesterBean>());
		session.setAttribute("semesterBean", null);
		SemesterWiseFeePaidReportBean semesterWiseFeePaidReportBean = new SemesterWiseFeePaidReportBean();
		session.setAttribute("semesterWiseFeePaidReportBean", semesterWiseFeePaidReportBean);
		
		return new ModelAndView("SemesterWiseFeePaidReport", "semesterWiseFeePaidReportBean", semesterWiseFeePaidReportBean);
	}

	@ModelAttribute("semesterList")
	public List<SemesterBean> generateSemesterList() throws MicroServiceException {
		
		List<SemesterBean> semesterList = semesterServiceConsumption.getSemesterBeanList();
		
		return semesterList;
	}

	@RequestMapping(value = "getSemesterWiseFeePaidDetail.html", method = RequestMethod.POST)
	public ModelAndView getSemesterWiseFeePaidDetail(
			@ModelAttribute("semesterWiseFeePaidReportBean") @Valid SemesterWiseFeePaidReportBean semesterWiseFeePaidReportBean,
			BindingResult result, HttpSession session) throws Exception {
		
		ModelAndView view = new ModelAndView("SemesterWiseFeePaidReport");
		if (!result.hasErrors()) {
			List<SemesterBean> semesterWiseFeePaidBeanList = reportsService.getSemesterWiseFeePaidReportDetails(
					semesterWiseFeePaidReportBean.getFromDate(), semesterWiseFeePaidReportBean.getToDate(),
					semesterWiseFeePaidReportBean.getSemester());
			if (semesterWiseFeePaidBeanList != null && semesterWiseFeePaidBeanList.size() > 0) {
				for (SemesterBean bean : semesterWiseFeePaidBeanList) {
					/*
					 * bean.setMaterialCategoryName(categoryMap.get(bean.getMaterialCategoryId()));
					 * bean.setMaterialTypeName(typeMap.get(bean.getMaterialTypeId()));
					 * bean.setMaterialUnitName(unitMap.get(bean.getUnitId()));
					 */
				}
				view.addObject("semesterWiseFeePaidBeanList", semesterWiseFeePaidBeanList);
				session.setAttribute("semesterWiseFeePaidBeanList", semesterWiseFeePaidBeanList);
				session.setAttribute("semesterWiseFeePaidBeanList", semesterWiseFeePaidBeanList);
			} else {
				session.setAttribute("semesterWiseFeePaidBeanList", new ArrayList<SemesterBean>());
				view.addObject("message", "No records found for vendor name " +semesterWiseFeePaidReportBean.getSemester() + ".");
			}
			Map<String, SemesterBean> semesterMap = semesterServiceConsumption.getSemesterMap();

			view.addObject("semesterBean", semesterMap.get(semesterWiseFeePaidReportBean.getSemester()));
			session.setAttribute("semesterBean", semesterMap.get(semesterWiseFeePaidReportBean.getSemester()));
		}

		
		return view;

	}
	
	@RequestMapping(value = "getSemesterWiseFeePaidDetail.html", method = RequestMethod.GET)
	public ModelAndView returnSemesterWiseFeePaidReport(HttpSession session) throws Exception {
		
		ModelAndView view = new ModelAndView("SemesterWiseFeePaidReport", "semesterWiseFeePaidReportBean", session.getAttribute("semesterWiseFeePaidReportBean"));		
		
		return view;

	}
	


}
