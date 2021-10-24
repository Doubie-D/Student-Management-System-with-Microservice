package com.csu.ohio.student.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "semester")
public class SemesterEntity {
	@Id
	private Integer studentId;
    private String transactionId;
    private String studentName;
    private Double feePaidAmount;
	private Double balance;
	private Date paidDate;
	private String status;
	
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
		return "SemesterEntity [studentId=" + studentId + ", transactionId=" + transactionId + ", studentName="
				+ studentName + ", feePaidAmount=" + feePaidAmount + ", balance=" + balance + ", paidDate=" + paidDate
				+ ", status=" + status + "]";
	}
	
}
