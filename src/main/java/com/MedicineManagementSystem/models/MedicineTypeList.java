package com.MedicineManagementSystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class MedicineTypeList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column
	private String typeName;
	
	@Column
	private String createdDate;
	
	@Column
	private String createdBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
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

	public MedicineTypeList(int id, String typeName, String createdDate, String createdBy) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
	}

	public MedicineTypeList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
