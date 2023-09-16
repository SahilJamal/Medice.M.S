package com.MedicineManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MedicineManagementSystem.models.UsersList;

public interface UsersListRepo extends JpaRepository<UsersList, Integer>{
	
	public UsersList findByName(String name);
	
}
