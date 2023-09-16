package com.MedicineManagementSystem.services;

import java.util.List;
import java.util.Optional;

import com.MedicineManagementSystem.models.StocksList;

public interface StocksService {

	public List<StocksList> GetStocksList();
	
	public List<StocksList> saveStocksList(StocksList sl);
	
	public void deleteStocksListById(int id);

	public Optional<StocksList> GetStocksListById(int id);
	
}
