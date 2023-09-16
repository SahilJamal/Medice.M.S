package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagementSystem.dao.MedicineCategoryListRepo;
import com.MedicineManagementSystem.models.MedicineCategoryList;

@Service
public class MedicineCategoryListServices implements MedicineCategoryListService{

	@Autowired
	MedicineCategoryListRepo mclr;
	
	@Override
	public List<MedicineCategoryList> GetMedecineCategoryList() {
		return mclr.findAll();
	}

	@Override
	public List<MedicineCategoryList> saveMedicineCategoryList(MedicineCategoryList mcl) {
		mclr.save(mcl);
		return mclr.findAll();
	}

	@Override
	public void deleteMedicineCategoryListById(int id) {
		mclr.deleteById(id);
	}

	@Override
	public Optional<MedicineCategoryList> GetMedecineCategoryListById(int id) {
		return mclr.findById(id);
	}

}
