package com.MedicineManagementSystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.MedicineManagementSystem.services.MedicineListService;
import com.MedicineManagementSystem.services.RequestListService;
import com.MedicineManagementSystem.services.SupplierListService;

@Controller
public class MedicineController {

	@Autowired
	RequestListService rls;
	
	@Autowired
	MedicineListService mls;
	
	@Autowired
	SupplierListService sls;
	
	@GetMapping({"","/","/index"})
	public String index(Model model) {	

		
		model.addAttribute("medicine", mls.numberOfMedicineList());
		model.addAttribute("supplier", sls.numberOfSupplierList());
		model.addAttribute("request", rls.numberOfRequestList());
		
		return "index";
	} 
	
	
}
