package com.MedicineManagementSystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SupplierList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String supplierName;
	
	@Column
	private String description;
	
	@Column
	private String status;
	
	@Column
	private String createdDate;
	
	@Column
	private String createdBy;

	public SupplierList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SupplierList(int id, String supplierName, String description, String status, String createdDate,
			String createdBy) {
		super();
		this.id = id;
		this.supplierName = supplierName;
		this.description = description;
		this.status = status;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
}
