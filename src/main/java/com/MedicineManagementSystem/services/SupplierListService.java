package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import com.MedicineManagementSystem.models.SupplierList;

public interface SupplierListService {

	public long numberOfSupplierList();
	
	public List<SupplierList> GetSupplierList();
	
	public List<SupplierList> saveSupplierList(SupplierList sl);
	
	public void deleteSupplierListById(int id);

	public Optional<SupplierList> GetSupplierListById(int id);
	
}
