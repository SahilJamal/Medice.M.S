package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagementSystem.dao.MedicineTypeListRepo;
import com.MedicineManagementSystem.models.MedicineTypeList;

@Service
public class MedicineTypeListServices implements MedicineTypeListService{

	@Autowired
	MedicineTypeListRepo mr;
	
	
	@Override
	public List<MedicineTypeList> GetMedecineTypeList() {
		return mr.findAll();
	}

	@Override
	public List<MedicineTypeList> saveMedicineTypeList(MedicineTypeList ml) {
		mr.save(ml);
		return mr.findAll();
	}

	@Override
	public void deleteMedicineTypeListById(int id) {
		
		mr.deleteById(id);
		
	}

	@Override
	public Optional<MedicineTypeList> GetMedecineTypeListById(int id) {
		return mr.findById(id);
	}

	
	
}
