package com.csu.ohio.student.bean;

import java.util.Date;

public class RegisterBean {
	private String firstName;
	private  String lastName;
	private String email;
	private  String address;
	private  Date dateOfBirth;
	private String Gender;
	private String password;
	private String confirmPassword;
	private Integer mobileNumber;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "RegisterEntity [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address="
				+ address + ", dateOfBirth=" + dateOfBirth + ", Gender=" + Gender + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", mobileNumber=" + mobileNumber + "]";
	}
}