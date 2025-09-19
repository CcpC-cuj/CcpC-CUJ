package com.ccpc.reachus;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class MailMessage {
	 @JsonProperty("user_name")
	private String name; 
	private Integer semester;
	@JsonProperty("dept")
	private String department; // for department same as front end
	@JsonProperty("phone")
	private String phoneNumber; // phoneNumber
	private String email;
	private String message;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toPlainText() {
		return "Name: "+name
				+"\nSemester: "+semester
				+"\nDepartment: "+department
				+"\nPhone Number: "+phoneNumber
				+"\nEmail: "+email
				+"\nMessage: "+message;
	}
}
