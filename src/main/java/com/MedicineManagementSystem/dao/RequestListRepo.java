package com.MedicineManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagementSystem.models.RequestList;

@Repository
public interface RequestListRepo extends JpaRepository<RequestList, Integer>{

}
