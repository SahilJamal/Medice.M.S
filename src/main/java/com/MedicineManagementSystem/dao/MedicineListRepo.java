package com.MedicineManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagementSystem.models.MedicineList;

@Repository
public interface MedicineListRepo extends JpaRepository<MedicineList, Integer>{

}
