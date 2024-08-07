package com.MedicineManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagementSystem.models.MedicineCategoryList;

@Repository
public interface MedicineCategoryListRepo extends JpaRepository<MedicineCategoryList, Integer>{

}
