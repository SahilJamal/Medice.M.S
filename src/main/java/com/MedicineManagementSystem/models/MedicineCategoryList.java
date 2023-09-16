package com.MedicineManagementSystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MedicineCategoryList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String categoryName;
	
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

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public MedicineCategoryList(int id, String categoryName, String createdDate, String createdBy) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
	}

	public MedicineCategoryList() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
	
}
