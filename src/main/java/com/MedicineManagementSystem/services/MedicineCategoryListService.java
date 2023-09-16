package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import com.MedicineManagementSystem.models.MedicineCategoryList;

public interface MedicineCategoryListService {

	 List<MedicineCategoryList> GetMedecineCategoryList();
	
	public List<MedicineCategoryList> saveMedicineCategoryList(MedicineCategoryList mcl);
	
	public void deleteMedicineCategoryListById(int id);

	public Optional<MedicineCategoryList> GetMedecineCategoryListById(int id);
	
}
