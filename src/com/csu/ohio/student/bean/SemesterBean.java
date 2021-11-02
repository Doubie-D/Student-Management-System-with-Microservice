package com.csu.ohio.student.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

public class SemesterBean {
	
	private Integer studentId;
	private String semester;
    private String transactionId;
    private String studentName;
    private Double feePaidAmount;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @NotNull
    @Past
	private Date paidDate;
	private Double balance;
	private String status;
	
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getFeePaidAmount() {
		return feePaidAmount;
	}
	public void setFeePaidAmount(Double feePaidAmount) {
		this.feePaidAmount = feePaidAmount;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Date getPaidDate() {
		return paidDate;
	}
	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "SemesterBean [studentId=" + studentId + ", semester=" + semester + ", transactionId=" + transactionId
				+ ", studentName=" + studentName + ", feePaidAmount=" + feePaidAmount + ", paidDate=" + paidDate
				+ ", balance=" + balance + ", status=" + status + "]";
	}
}
