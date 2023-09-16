package com.MedicineManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagementSystem.models.Receiving;

@Repository
public interface ReceivingRepo extends JpaRepository<Receiving, Integer>{

}
