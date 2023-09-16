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

import com.MedicineManagementSystem.models.MedicineTypeList;
import com.MedicineManagementSystem.services.MedicineTypeListService;

@Controller
public class MedicineTypeListController {

	//MedicineTypeList 
		//Starts
		@Autowired
		MedicineTypeListService sr;
		
		@GetMapping("/medicine-type")
		public String medicinetypeList(Model model) {
				
			MedicineTypeList mtl = new MedicineTypeList();
			model.addAttribute("mtl", mtl );
			
	        List<MedicineTypeList> lmtl = sr.GetMedecineTypeList();
	        model.addAttribute("lmtl",lmtl);
			
			return "medicine-type";
		}
		
		@PostMapping("/saveMedicineTypeList")
		public String saveMedicinetypeList(@ModelAttribute("mtl" ) MedicineTypeList mtl) {
			sr.saveMedicineTypeList(mtl);
			return "redirect:/medicine-type";
		}
		
		
		@GetMapping("/deleteMedicineTypeList/{id}")
		public String deleteMedicineTypeListById(@PathVariable("id") int id) {
			
			sr.deleteMedicineTypeListById(id);
			
			return "redirect:/medicine-type";
			
		}
		
		@GetMapping("/updateMedicineTypeList/{id}")
		public String updateMedicineTypeList(@PathVariable("id") int id, Model model) {
			
			Optional<MedicineTypeList> Om = sr.GetMedecineTypeListById(id);
			model.addAttribute("mtl",Om.get());
			
			return "updatemt";
		}
		
		@PostMapping("/updateMedicine/{id}")
		public String updateMedicine(@ModelAttribute("mtl") MedicineTypeList mtl , @PathVariable("id") int id) {
			mtl.setId(id);
			sr.saveMedicineTypeList(mtl);
			return "redirect:/medicine-type";
		}
		
		//MedicineTypeList
		//ends
	
}
