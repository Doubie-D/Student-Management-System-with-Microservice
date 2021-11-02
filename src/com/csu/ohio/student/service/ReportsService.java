package com.csu.ohio.student.service;

import java.util.Date;
import java.util.List;

import com.csu.ohio.student.bean.SemesterBean;

public interface ReportsService {
	public List<SemesterBean> getSemesterWiseFeePaidReportDetails(Date from, Date to, String semester);
}
