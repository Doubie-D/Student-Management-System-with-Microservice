package com.csu.ohio.student.bean;

public class StudentTypeBean 
{
	private String studentType;
	private Double minimumBill;
	private Double maximumBill;
	
	public String getstudentType() {
		return studentType;
	}
	public void setCustomerType(String studentType) {
		this.studentType = studentType;
	}
	public Double getMinimumBill() {
		return minimumBill;
	}
	public void setMinimumBill(Double minimumBill) {
		this.minimumBill = minimumBill;
	}
	public Double getMaximumBill() {
		return maximumBill;
	}
	public void setMaximumBill(Double maximumBill) {
		this.maximumBill = maximumBill;
	}

}
