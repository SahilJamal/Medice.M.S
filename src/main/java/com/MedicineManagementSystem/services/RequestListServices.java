package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagementSystem.dao.RequestListRepo;
import com.MedicineManagementSystem.models.RequestList;

@Service
public class RequestListServices implements RequestListService{

	@Autowired
	RequestListRepo rlr;

	public long numberOfRequestList(){
		return rlr.count();
	}
	
	@Override
	public List<RequestList> GetRequestList() {
		return rlr.findAll();
	}

	@Override
	public List<RequestList> saveRequestList(RequestList rl) {
		rlr.save(rl);
		return rlr.findAll();
	}

	@Override
	public void deleteRequestListById(int id) {
		rlr.deleteById(id);
		
	}

	@Override
	public Optional<RequestList> GetRequestListById(int id) {
		return rlr.findById(id);
	}
	
}
