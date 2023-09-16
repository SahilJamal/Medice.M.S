package com.MedicineManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagementSystem.models.ReturningList;

@Repository
public interface ReturningRepo extends JpaRepository<ReturningList, Integer>{

}
