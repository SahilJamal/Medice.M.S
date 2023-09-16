package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagementSystem.dao.ReceivingRepo;
import com.MedicineManagementSystem.models.Receiving;

@Service
public class ReceivingServices implements ReceivingService{

	@Autowired
	ReceivingRepo rr;
	
	@Override
	public List<Receiving> GetReceivingList() {
		return rr.findAll();
	}

	@Override
	public List<Receiving> saveReceivingList(Receiving r) {
		rr.save(r);
		return rr.findAll();
	}

	@Override
	public void deleteReceivingListById(int id) {
		rr.deleteById(id);
	}

	@Override
	public Optional<Receiving> GetReceivingListById(int id) {
		return rr.findById(id);
	}

}
