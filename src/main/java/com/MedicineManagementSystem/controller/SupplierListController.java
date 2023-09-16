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

import com.MedicineManagementSystem.models.SupplierList;
import com.MedicineManagementSystem.services.SupplierListService;

@Controller
public class SupplierListController {

	//SupplierList
		//starts
		
		@Autowired
		SupplierListService sls;
		
		@GetMapping("/supplier")
		public String supplierList(Model model) {
			
			SupplierList sl = new SupplierList();
			model.addAttribute("sl", sl );
			
	        List<SupplierList> lsl = sls.GetSupplierList();
	        model.addAttribute("lsl",lsl);
			
			return "supplier";
		}
		
		@PostMapping("/saveSupplierList")
		public String saveSupplierList(@ModelAttribute("sl") SupplierList sl) {
			sls.saveSupplierList(sl);
			return "redirect:/supplier";
		}
		
		@GetMapping("/deleteSupplierList/{id}")
		public String deleteSupplierListById(@PathVariable("id") int id) {
			
			sls.deleteSupplierListById(id);
			
			return "redirect:/supplier";
			
		}
		
		@GetMapping("/updateSupplierList/{id}")
		public String updateSupplierList(@PathVariable("id") int id, Model model) {
			
			Optional<SupplierList> Os = sls.GetSupplierListById(id);
			model.addAttribute("sl",Os.get());
			
			return "updates";
		}
		
		@PostMapping("/updateSupplier/{id}")
		public String updateSupplier(@ModelAttribute("sl") SupplierList sl,@PathVariable("id") int id) {
			sl.setId(id);
			sls.saveSupplierList(sl);
			return "redirect:/supplier";
		}
		
		//SupplierList
		//Ends
	
}
