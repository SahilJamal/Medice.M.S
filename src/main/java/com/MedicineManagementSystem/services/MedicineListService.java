package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import com.MedicineManagementSystem.models.MedicineList;

public interface MedicineListService {
	
	public long numberOfMedicineList();
	
	public List<MedicineList> GetMedecineList();
	
	public List<MedicineList> saveMedicineList(MedicineList ml);
	
	public void deleteMedicineListById(int id);

	public Optional<MedicineList> GetMedecineListById(int id);

}
