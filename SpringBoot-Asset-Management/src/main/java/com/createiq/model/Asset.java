package com.createiq.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Asset {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer assetId;
	private String brandName;
	private String modelNumber;
	private String description;
	private String assetType;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="VEN_ASSET", joinColumns = @JoinColumn(name = "assetId"), 
	  inverseJoinColumns = @JoinColumn(name = "vendorId"))
	private List<Vendor> vendors;

	
	
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public List<Vendor> getVendors() {
		return vendors;
	}


	public void setVendors(List<Vendor> vendors) {
		this.vendors = vendors;
	}


	public Asset(Integer assetId, String brandName, String modelNumber, String description, String assetType,
			List<Vendor> vendors) {
		super();
		this.assetId = assetId;
		this.brandName = brandName;
		this.modelNumber = modelNumber;
		this.description = description;
		this.assetType = assetType;
		this.vendors = vendors;
	}


	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", brandName=" + brandName + ", modelNumber=" + modelNumber
				+ ", description=" + description + ", assetType=" + assetType + "]";
	}

}
