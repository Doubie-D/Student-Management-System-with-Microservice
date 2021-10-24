package com.csu.ohio.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class StudentTypeEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String studentType;
	private Double minimumBill;
	private Double maximumBill;
	
	public String getstudentType() {
		return studentType;
	}
	public void setstudentType(String studentType) {
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
	
	@Override
	public String toString() {
		return "CustomerTypeEntity [studentType=" + studentType + ", minimumBill=" + minimumBill + ", maximumBill="
				+ maximumBill + "]";
	}

}
