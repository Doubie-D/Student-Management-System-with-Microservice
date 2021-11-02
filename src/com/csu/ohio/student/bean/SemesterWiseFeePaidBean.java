package com.csu.ohio.student.bean;

import java.sql.Date;

public class SemesterWiseFeePaidBean {


	
	private SemesterBean semesterBean = new SemesterBean();
	private Double balance;   	
	
	public SemesterWiseFeePaidBean(Object[] columns) {   		
		this.semesterBean.setStudentId(columns[0] != null ? (Integer)columns[0] : 0);
		this.semesterBean.setTransactionId((String)columns[2]);
		this.semesterBean.setStudentName((String)columns[3]);
		this.semesterBean.setSemester((String)columns[4]);
		this.semesterBean.setFeePaidAmount((Double)columns[5]);
		this.balance = (Double) columns[6];
		Date date = (Date) columns[7];		
		this.semesterBean.setPaidDate(Date.valueOf(date.toString()));
		this.semesterBean.setStatus((String)columns[8]);
    }
		
	public SemesterWiseFeePaidBean() {
		super();
	}

	public SemesterWiseFeePaidBean(SemesterBean semesterBean, Double balance) {
		super();
		this.balance = balance;
		this.semesterBean = semesterBean;		
	}	

	public SemesterBean getPurchaseBean() {
		return semesterBean;
	}

	public void setSemesterBean(SemesterBean semesterBean) {
		this.semesterBean = semesterBean;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SemesterWiseFeePaidBean [semesterBean=" + semesterBean + ", balance=" + balance + "]";
	}
	
}
