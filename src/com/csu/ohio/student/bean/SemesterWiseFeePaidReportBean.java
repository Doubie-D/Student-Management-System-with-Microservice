package com.csu.ohio.student.bean;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class SemesterWiseFeePaidReportBean {
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fromDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date toDate;
	@NotBlank
	private String semester;
	public SemesterWiseFeePaidReportBean() {
		super();
	}
	
	
	
	public SemesterWiseFeePaidReportBean(Date fromDate, Date toDate, String semester) {
		super();
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.semester = semester;
	}



	public Date getFromDate() {
		return fromDate;
	}



	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}



	public Date getToDate() {
		return toDate;
	}



	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}



	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "SemesterWiseFeePaidReportBean [fromDate=" + fromDate + ", toDate=" + toDate + ", semester=" + semester
				+ "]";
	}

}
