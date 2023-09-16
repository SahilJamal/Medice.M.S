package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagementSystem.dao.ReturningRepo;
import com.MedicineManagementSystem.models.ReturningList;

@Service
public class ReturningServices implements ReturningService{

	@Autowired
	ReturningRepo rr;
	
	@Override
	public List<ReturningList> GetReturningList() {
		return rr.findAll();
	}

	@Override
	public List<ReturningList> saveReturningList(ReturningList r) {
		rr.save(r);
		return rr.findAll();
	}

	@Override
	public void deleteReturningListById(int id) {
		rr.deleteById(id);
		
	}

	@Override
	public Optional<ReturningList> GetReturningListById(int id) {
		return rr.findById(id);
	}

}
