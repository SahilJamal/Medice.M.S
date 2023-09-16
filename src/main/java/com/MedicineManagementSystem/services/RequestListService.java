package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import com.MedicineManagementSystem.models.RequestList;

public interface RequestListService {

	public long numberOfRequestList();
	
	public List<RequestList> GetRequestList();
	
	public List<RequestList> saveRequestList(RequestList rl);
	
	public void deleteRequestListById(int id);

	public Optional<RequestList> GetRequestListById(int id);
	
}
