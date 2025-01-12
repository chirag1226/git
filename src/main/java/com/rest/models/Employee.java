package com.rest.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity(name="EMPLOYEE_ENTITY")
@Table(name = "EMPLOYEE_TABLE")
public class Employee {
	public Employee() {
		super();
	}
	@Column(name = "NAME")
	private String name;
	@Id
	@Column(name = "PB_ID")
	private String pbId;
	@OneToOne(targetEntity=RfId.class,cascade=CascadeType.ALL)  
	private RfId reffId;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "DIVISION")
	private String division;

	@Column(name = "PHONE_NO")
	private String phoneNo;
	@Column(name = "PROGRAM_CODE")
	private String programCode;
	@Column(name = "IS_VALID")
	private boolean valid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getProgramCode() {
		return programCode;
	}
	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}
	public String getPbId() {
		return pbId;
	}
	public void setPbId(String pbId) {
		this.pbId = pbId;
	}
	public RfId getReffId() {
		return reffId;
	}
	public void setReffId(RfId reffId) {
		this.reffId = reffId;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public Employee(String name, String pbId, RfId reffId, String designation, String division, String phoneNo,
			String programCode, boolean valid) {
		super();
		this.name = name;
		this.pbId = pbId;
		this.reffId = reffId;
		this.designation = designation;
		this.division = division;
		this.phoneNo = phoneNo;
		this.programCode = programCode;
		this.valid = valid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", pbId=" + pbId + ", reffId=" + reffId + ", designation=" + designation
				+ ", division=" + division + ", phoneNo=" + phoneNo + ", programCode=" + programCode + ", valid="
				+ valid + "]";
	}
	
	
}
