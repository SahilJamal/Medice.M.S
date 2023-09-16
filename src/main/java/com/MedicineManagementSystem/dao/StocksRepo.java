package com.MedicineManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagementSystem.models.StocksList;

@Repository
public interface StocksRepo extends JpaRepository<StocksList, Integer>{

}
