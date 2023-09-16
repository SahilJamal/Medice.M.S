package com.MedicineManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagementSystem.models.SupplierList;

@Repository
public interface SupplierListRepo extends JpaRepository<SupplierList, Integer>{

}
