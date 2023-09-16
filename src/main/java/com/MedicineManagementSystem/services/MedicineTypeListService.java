package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import com.MedicineManagementSystem.models.MedicineTypeList;

public interface MedicineTypeListService {
	
	public List<MedicineTypeList> GetMedecineTypeList();
	
	public List<MedicineTypeList> saveMedicineTypeList(MedicineTypeList ml);
	
	public void deleteMedicineTypeListById(int id);

	public Optional<MedicineTypeList> GetMedecineTypeListById(int id);

}
