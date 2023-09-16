package com.MedicineManagementSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.MedicineManagementSystem.models.MedicineList;
import com.MedicineManagementSystem.models.StocksList;
import com.MedicineManagementSystem.models.SupplierList;
import com.MedicineManagementSystem.services.MedicineListService;
import com.MedicineManagementSystem.services.StocksService;
import com.MedicineManagementSystem.services.SupplierListService;

@Controller
public class StocksController {

	//Stocks
	//starts
	
	
	@Autowired
	StocksService ss;
	
	@Autowired
	SupplierListService sls;
	
	@Autowired
	MedicineListService mls;
	
	
	@GetMapping("/add-stock")
	public String getStocksList(Model model) {
		
		StocksList sl = new StocksList();
		model.addAttribute("sl", sl);
		
		List<SupplierList> lsl = sls.GetSupplierList();
		model.addAttribute("lsl", lsl);
		
		List<MedicineList> lml = mls.GetMedecineList();
		model.addAttribute("lml", lml);
		
		return "add-stock";
		
	}
	
	@PostMapping("/saveStocksList")
	public String saveStocksList(@ModelAttribute("sl") StocksList sl) {
		ss.saveStocksList(sl);
		return "redirect:/add-stock";
	}
	
	
	@GetMapping("/manage-stock")
	public String manageStocksList(Model model) {
		
		List<StocksList> lsl = ss.GetStocksList();
		model.addAttribute("lsl",lsl);
		
		return "manage-stock";
		
	}
	
	@GetMapping("/updateStocksLists/{id}")
	public String updateStocksList(@PathVariable("id") int id, Model model) {
		
		Optional<StocksList> Om = ss.GetStocksListById(id);
		model.addAttribute("sl",Om.get());
		
		List<SupplierList> lsl = sls.GetSupplierList();
		model.addAttribute("lsl", lsl);
		
		List<MedicineList> lml = mls.GetMedecineList();
		model.addAttribute("lml", lml);
		
		return "updatesl";
	}
	
	@PostMapping("/updateStocksList/{id}")
	public String updateStocks(@ModelAttribute("r") StocksList sl , @PathVariable("id") int id) {
		sl.setId(id);
		ss.saveStocksList(sl);
		return "redirect:/manage-stock";
	}
	
	@GetMapping("/deleteStocksList/{id}")
	public String deleteStocksListById(@PathVariable("id") int id) {
		
		ss.deleteStocksListById(id);
		
		return "redirect:/manage-stock";
		
	}
	
	
	
	
	//Stocks
	//ends
}
