package com.createiq.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	@NotEmpty
	@Size(min= 4, message = "Min length should be 4")
	private String ename;
	@NotEmpty(message = "Lname should not be empty")
	@Size(min= 4, message = "Min length should be 4")
	private String lname;
	@NotEmpty(message = "Email should not be empty")
	@Email
	private String email;
	@NotNull
	private Double esal;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getEsal() {
		return esal;
	}

	public void setEsal(Double esal) {
		this.esal = esal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer eid, String ename, String lname, String email, Double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.lname = lname;
		this.email = email;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", lname=" + lname + ", email=" + email + ", esal=" + esal
				+ "]";
	}

}
