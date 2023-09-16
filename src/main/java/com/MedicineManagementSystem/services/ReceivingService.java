package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import com.MedicineManagementSystem.models.Receiving;

public interface ReceivingService {

	public List<Receiving> GetReceivingList();
	
	public List<Receiving> saveReceivingList(Receiving r);
	
	public void deleteReceivingListById(int id);

	public Optional<Receiving> GetReceivingListById(int id);
	
}
