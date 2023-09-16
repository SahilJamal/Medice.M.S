package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagementSystem.dao.StocksRepo;
import com.MedicineManagementSystem.models.StocksList;

@Service
public class StocksServices implements StocksService{

	@Autowired
	StocksRepo sr;
	
	@Override
	public List<StocksList> GetStocksList() {
		return sr.findAll();
	}

	@Override
	public List<StocksList> saveStocksList(StocksList sl) {
		sr.save(sl);
		return sr.findAll();
	}

	@Override
	public void deleteStocksListById(int id) {
		sr.deleteById(id);
		
	}

	@Override
	public Optional<StocksList> GetStocksListById(int id) {
		return sr.findById(id);
	}

}
