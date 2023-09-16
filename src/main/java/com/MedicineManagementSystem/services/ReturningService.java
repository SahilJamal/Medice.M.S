package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import com.MedicineManagementSystem.models.ReturningList;

public interface ReturningService {

	public List<ReturningList> GetReturningList();
	
	public List<ReturningList> saveReturningList(ReturningList r);
	
	public void deleteReturningListById(int id);

	public Optional<ReturningList> GetReturningListById(int id);
	
}
