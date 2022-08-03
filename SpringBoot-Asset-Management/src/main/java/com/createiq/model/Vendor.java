package com.createiq.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer vendorId;
	private String city;
	private String state;
	private String zipcode;
	private String accountManagerName;
	private String accountManagerPhone;
	public Integer getVendorId() {
		return vendorId;
	}
	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAccountManagerName() {
		return accountManagerName;
	}
	public void setAccountManagerName(String accountManagerName) {
		this.accountManagerName = accountManagerName;
	}
	public String getAccountManagerPhone() {
		return accountManagerPhone;
	}
	public void setAccountManagerPhone(String accountManagerPhone) {
		this.accountManagerPhone = accountManagerPhone;
	}
	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", accountManagerName=" + accountManagerName + ", accountManagerPhone=" + accountManagerPhone + "]";
	}
	
	

}
