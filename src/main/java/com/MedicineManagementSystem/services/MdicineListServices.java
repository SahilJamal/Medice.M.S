package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagementSystem.dao.MedicineListRepo;
import com.MedicineManagementSystem.models.MedicineList;

@Service
public class MdicineListServices implements MedicineListService{
	
	@Autowired
	MedicineListRepo mlr;

	@Override
	public List<MedicineList> GetMedecineList() {
				
		return mlr.findAll();
		
	}

	@Override
	public List<MedicineList> saveMedicineList(MedicineList ml) {
		mlr.save(ml);
		return mlr.findAll();
	}

	@Override
	public void deleteMedicineListById(int id) {

		mlr.deleteById(id);
		
	}

	@Override
	public Optional<MedicineList> GetMedecineListById(int id) {
		return mlr.findById(id);
	}

	@Override
	public long numberOfMedicineList() {
		return mlr.count();
	}

}
