package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import com.MedicineManagementSystem.models.UsersList;

public interface UsersListService {

	public List<UsersList> getUsersList();
	
	public List<UsersList> saveUsersList(UsersList ul);
	
	public Optional<UsersList> updateUsersListById(int id);
	
	public void deleteUsersListById(int id);
}
