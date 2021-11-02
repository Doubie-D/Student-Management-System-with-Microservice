package com.csu.ohio.student.bean;

import java.util.Date;

public class StudentBean 
{
	private Integer studentId;
	private String studentName;
	private Date billingDate;
	private Double bill;
	private String studentType;
	
	public Integer getstudentId() {
		return studentId;
	}
	public void setstudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getstudentName() {
		return studentName;
	}
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}
	public Double getBill() {
		return bill;
	}
	public void setBill(Double bill) {
		this.bill = bill;
	}
	public String getstudentType() {
		return studentType;
	}
	public void setstudentType(String studentType) {
		this.studentType = studentType;
	}

	
}
