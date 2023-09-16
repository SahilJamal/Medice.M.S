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
import com.MedicineManagementSystem.models.MedicineList;
import com.MedicineManagementSystem.models.MedicineTypeList;
import com.MedicineManagementSystem.models.SupplierList;
import com.MedicineManagementSystem.services.MedicineCategoryListService;

import com.MedicineManagementSystem.services.MedicineListService;
import com.MedicineManagementSystem.services.MedicineTypeListService;
import com.MedicineManagementSystem.services.SupplierListService;


@Controller
public class MedicineListController {

	//MedicineList
	//Starts
	
	@Autowired
	MedicineListService mls;
	
	@Autowired
	MedicineCategoryListService mcls;
	
	@Autowired
	MedicineTypeListService mtls;
	
	@Autowired
	SupplierListService sls;
	
	
	@GetMapping("/add-medicine")
	public String getMedicineList(Model model) {
		
		MedicineList ml = new MedicineList();
		model.addAttribute("ml", ml);
		
		List<MedicineList> lml = mls.GetMedecineList();
		model.addAttribute("lml", lml);
		
		List<MedicineTypeList> lmtl = mtls.GetMedecineTypeList();
		model.addAttribute("lmtl", lmtl);
		
		List<MedicineCategoryList> lmcl = mcls.GetMedecineCategoryList();
		model.addAttribute("lmcl", lmcl);
		
		List<SupplierList> lsl = sls.GetSupplierList();
		model.addAttribute("lsl", lsl);
		
		return "add-medicine";
		
	}
	
	
	@PostMapping("/saveMedicineList")
	public String saveMedicineList(@ModelAttribute("ml") MedicineList ml) {
		mls.saveMedicineList(ml);
		return "redirect:/add-medicine";
	}
	
	@GetMapping("/manage-medicine")
	public String manageMedicineList(Model model) {
		
		List<MedicineList> lml = mls.GetMedecineList();
		model.addAttribute("lml", lml);
		
		return "manage-medicine";
		
	}
	
	@GetMapping("/updateMedicineList/{id}")
	public String updateMedicineList(@PathVariable("id") int id, Model model) {
		
		Optional<MedicineList> Om = mls.GetMedecineListById(id);
		model.addAttribute("ml",Om.get());
		
		List<MedicineTypeList> lmtl = mtls.GetMedecineTypeList();
		model.addAttribute("lmtl", lmtl);
		
		List<MedicineCategoryList> lmcl = mcls.GetMedecineCategoryList();
		model.addAttribute("lmcl", lmcl);
		
		List<SupplierList> lsl = sls.GetSupplierList();
		model.addAttribute("lsl", lsl);
		
		return "updateml";
	}
	
	@PostMapping("/updateMedicineLists/{id}")
	public String updateMedicine(@ModelAttribute("ml") MedicineList ml , @PathVariable("id") int id) {
		ml.setId(id);
		mls.saveMedicineList(ml);
		return "redirect:/manage-medicine";
	}
	
	@GetMapping("/deleteMedicineList/{id}")
	public String deleteMedicineListById(@PathVariable("id") int id) {
		
		mls.deleteMedicineListById(id);
		
		return "redirect:/manage-medicine";
		
	}
	
}
