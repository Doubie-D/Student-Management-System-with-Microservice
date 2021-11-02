package com.csu.ohio.student.dao;

import java.util.Date;
import java.util.List;

import com.csu.ohio.student.bean.SemesterBean;



public interface ReportsDAO {
	public List<SemesterBean> getSemesterWiseFeePaidReport(Date from, Date to, String vendorName);
}
