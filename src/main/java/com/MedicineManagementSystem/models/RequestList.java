package com.MedicineManagementSystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RequestList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String medicineName;
	
	@Column
	private String specification;
	
	@Column
	private String supplierName;
	
	@Column
	private String categoryName;
	
	@Column
	private String typeName;
	
	@Column
	private int measurement;
	
	@Column
	private int price;
	
	@Column
	private int quantity;
	
	@Column
	private int amount;
	
	@Column
	private String description;
	
	@Column
	private String dateProcessed;

	@Column
	private String processedBy;
		
	
	
	public RequestList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestList(int id, String medicineName, String specification, String supplierName, String categoryName,
			String typeName, int measurement, int price, int quantity, int amount, String description,
			String dateProcessed, String processedBy) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.specification = specification;
		this.supplierName = supplierName;
		this.categoryName = categoryName;
		this.typeName = typeName;
		this.measurement = measurement;
		this.price = price;
		this.quantity = quantity;
		this.amount = amount;
		this.description = description;
		this.dateProcessed = dateProcessed;
		this.processedBy = processedBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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

	public int getMeasurement() {
		return measurement;
	}

	public void setMeasurement(int measurement) {
		this.measurement = measurement;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateProcessed() {
		return dateProcessed;
	}

	public void setDateProcessed(String dateProcessed) {
		this.dateProcessed = dateProcessed;
	}

	public String getProcessedBy() {
		return processedBy;
	}

	public void setProcessedBy(String processedBy) {
		this.processedBy = processedBy;
	}
	
}
