package com.MedicineManagementSystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReturningList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String supplierName;
	
	@Column
	private String medicineName;
	
	@Column
	private int price;
	
	@Column
	private int quantity;
	
	@Column
	private int amount;
	
	@Column
	private String remarks;
	
	@Column
	private String referenceNumber;
	
	@Column
	private String dateProcessed;
	
	@Column
	private String processedBy;
	
	public ReturningList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReturningList(int id, String supplierName, String medicineName, int price, int quantity, int amount,
			String remarks, String referenceNumber, String dateProcessed, String processedBy) {
		super();
		this.id = id;
		this.supplierName = supplierName;
		this.medicineName = medicineName;
		this.price = price;
		this.quantity = quantity;
		this.amount = amount;
		this.remarks = remarks;
		this.referenceNumber = referenceNumber;
		this.dateProcessed = dateProcessed;
		this.processedBy = processedBy;
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

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
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
