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

import com.MedicineManagementSystem.models.MedicineCategoryList;
import com.MedicineManagementSystem.services.MedicineCategoryListService;

@Controller
public class MedicineCategoryListController {

	//MedicineCategoryList
		//Starts
		
		@Autowired
		MedicineCategoryListService mcls;
		
		@GetMapping("/medicine-category")
		public String medicineCategoryList(Model model) {
			
			MedicineCategoryList mcl = new MedicineCategoryList();
			model.addAttribute("mcl", mcl );
			
	        List<MedicineCategoryList> lmcl = mcls.GetMedecineCategoryList();
	        model.addAttribute("lmcl",lmcl);
			
			return "medicine-category";
		}
		
		@PostMapping("/saveMedicineCategoryList")
		public String saveMedicineCategoryList(@ModelAttribute("mcl" ) MedicineCategoryList mcl) {
			mcls.saveMedicineCategoryList(mcl);
			return "redirect:/medicine-category";
		}
		
		@GetMapping("/deleteMedicineCategoryList/{id}")
		public String deleteMedicineCategoryListById(@PathVariable("id") int id) {
			
			mcls.deleteMedicineCategoryListById(id);
			
			return "redirect:/medicine-category";
			
		}
		
		@GetMapping("/updateMedicineCategoryList/{id}")
		public String updateMedicineCategoryList(@PathVariable("id") int id, Model model) {
			
			Optional<MedicineCategoryList> Om = mcls.GetMedecineCategoryListById(id);
			model.addAttribute("mcl",Om.get());
			
			return "updatemc";
		}
		
		@PostMapping("/updateMedicineCategory/{id}")
		public String updateMedicineCategory(@ModelAttribute("mcl") MedicineCategoryList mcl , @PathVariable("id") int id) {
			mcl.setId(id);
			mcls.saveMedicineCategoryList(mcl);
			return "redirect:/medicine-category";
		}
		
		//MedicineCategoryList
		//ends
	
}
