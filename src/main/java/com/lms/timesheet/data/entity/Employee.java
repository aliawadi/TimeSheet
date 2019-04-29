package com.lms.timesheet.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "EMPID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;

	@Column(name = "FIRST_NAME")
	private String FIRST_NAME;

	@Column(name = "LAST_NAME")
	private String LAST_NAME;

	@Column(name = "EMAIL_ID")
	private String EMAIL_ID ;

	@Column(name = "MANAGER_NAME")
	private String MANAGER_NAME ;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String FIRST_NAME) {
		this.FIRST_NAME = FIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String LAST_NAME) {
		this.LAST_NAME = LAST_NAME;
	}

	public String getEMAIL_ID() {
		return EMAIL_ID;
	}

	public void setEMAIL_ID(String EMAIL_ID) {
		this.EMAIL_ID = EMAIL_ID;
	}

	public String getMANAGER_NAME() {
		return MANAGER_NAME;
	}

	public void setMANAGER_NAME(String MANAGER_NAME) {
		this.MANAGER_NAME = MANAGER_NAME;
	}

	public String getMOBILE_NUMBER() {
		return MOBILE_NUMBER;
	}

	public void setMOBILE_NUMBER(String MOBILE_NUMBER) {
		this.MOBILE_NUMBER = MOBILE_NUMBER;
	}

	@Column(name = "MOBILE_NUMBER")
	private String MOBILE_NUMBER;

}
