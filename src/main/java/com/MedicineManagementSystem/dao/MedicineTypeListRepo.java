package com.MedicineManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagementSystem.models.MedicineTypeList;

@Repository
public interface MedicineTypeListRepo extends JpaRepository<MedicineTypeList, Integer>{

}
