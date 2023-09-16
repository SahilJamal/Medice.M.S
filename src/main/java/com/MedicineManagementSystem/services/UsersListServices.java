package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.MedicineManagementSystem.dao.UsersListRepo;
import com.MedicineManagementSystem.models.UsersList;

@Service
public class UsersListServices implements UsersListService,UserDetailsService{

	@Autowired
	UsersListRepo ulr;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return ulr.findByName(username);
	}

	@Override
	public List<UsersList> getUsersList() {
		return ulr.findAll();
	}

	@Override
	public List<UsersList> saveUsersList(UsersList ul) {
		ulr.save(ul);
		return ulr.findAll();
	}

	@Override
	public Optional<UsersList> updateUsersListById(int id) {
		return ulr.findById(id);
	}

	@Override
	public void deleteUsersListById(int id) {
		ulr.deleteById(id);
	}

}
