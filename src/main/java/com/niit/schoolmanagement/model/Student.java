package com.niit.schoolmanagement.model;

/*
 *  This is a model class for student
 *  contains setters and getter methods to access private properties
 */

public class Student {
     private int studentId;
     private String studentName;
     private String studentAddress;
     private String gender;
     private String studentPassword;
     private String studentMailId;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	public String getStudentMailId() {
		return studentMailId;
	}
	public void setStudentMailId(String studentMailId) {
		this.studentMailId = studentMailId;
	}
}
