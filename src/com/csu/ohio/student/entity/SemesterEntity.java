package com.csu.ohio.student.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "semester")
public class SemesterEntity {
	@Id
	@Column(name = "student_id")
	private Integer studentId;
	@Column(name = "transaction_id")
	private String transactionId;
	@Column(name = "student_name")
    private String studentName;
	@Column(name = "semester")
    private String semester;
	@Column(name = "fee_paid_amount")
    private Double feePaidAmount;
	@Column(name = "balance")
	private Double balance;
	@Column(name = "paid_date")
	private Date paidDate;
	@Column(name = "status")
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
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
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
				+ studentName + ", semester=" + semester + ", feePaidAmount=" + feePaidAmount + ", balance=" + balance
				+ ", paidDate=" + paidDate + ", status=" + status + "]";
	}
}