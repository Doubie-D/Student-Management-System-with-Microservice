package com.csu.ohio.student.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csu.ohio.student.bean.SemesterBean;
import com.csu.ohio.student.dao.ReportsDAO;
import com.csu.ohio.student.entity.SemesterEntity;


@Service
public class ReportsServiceImpl implements ReportsService {

	@Autowired
	private ReportsDAO reportsDAO;
	
	List<SemesterEntity> semesterEntity;
	
	@Override
	public List<SemesterBean> getSemesterWiseFeePaidReportDetails(Date from, Date to, String semester) {
		List<SemesterBean> semesterWiseFeePaidBeanList = reportsDAO.getSemesterWiseFeePaidReport(from,to,semester);
		return semesterWiseFeePaidBeanList;
	}

}
