package com.MedicineManagementSystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MedicineList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String specification;
	
	@Column
	private String categoryName;
	
	@Column
	private String typeName;
	
	@Column
	private String supplierName;
	
	@Column
	private int measurement;
	
	@Column
	private String remarks;
	
	@Column
	private int price;
	
	@Column
	private String expiryDate;
	
	@Column
	private int quantityOnHand;

	@Column
	private String createdBy;

	public MedicineList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicineList(int id, String name, String specification, String categoryName, String typeName,
			String supplierName, int measurement, String remarks, int price, String expiryDate, int quantityOnHand,
			String createdBy) {
		super();
		this.id = id;
		this.name = name;
		this.specification = specification;
		this.categoryName = categoryName;
		this.typeName = typeName;
		this.supplierName = supplierName;
		this.measurement = measurement;
		this.remarks = remarks;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantityOnHand = quantityOnHand;
		this.createdBy = createdBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public int getMeasurement() {
		return measurement;
	}

	public void setMeasurement(int measurement) {
		this.measurement = measurement;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
}
