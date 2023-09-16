package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagementSystem.dao.SupplierListRepo;
import com.MedicineManagementSystem.models.SupplierList;

@Service
public class SupplierListServices implements SupplierListService{

	@Autowired
	SupplierListRepo slr;
	
	
	@Override
	public List<SupplierList> GetSupplierList() {
		return slr.findAll();
	}

	@Override
	public List<SupplierList> saveSupplierList(SupplierList sl) {
		slr.save(sl);
		return slr.findAll();
	}

	@Override
	public void deleteSupplierListById(int id) {
		slr.deleteById(id);
	}

	@Override
	public Optional<SupplierList> GetSupplierListById(int id) {
		return slr.findById(id);
	}

	@Override
	public long numberOfSupplierList() {
		return slr.count();
	}

}
