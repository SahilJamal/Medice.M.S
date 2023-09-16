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
import com.MedicineManagementSystem.models.RequestList;
import com.MedicineManagementSystem.models.SupplierList;
import com.MedicineManagementSystem.services.MedicineCategoryListService;
import com.MedicineManagementSystem.services.MedicineListService;
import com.MedicineManagementSystem.services.MedicineTypeListService;
import com.MedicineManagementSystem.services.RequestListService;
import com.MedicineManagementSystem.services.SupplierListService;

@Controller
public class RequestListController {

	//RequestList
	//starts 
	
	
	@Autowired
	MedicineListService mls;
	
	@Autowired
	MedicineCategoryListService mcls;
	
	@Autowired
	MedicineTypeListService mtls;
	
	@Autowired
	SupplierListService sls;
	
	@Autowired
	RequestListService rls;
	
	
	@GetMapping("/add-request")
	public String getRequestList(Model model) {
		
		RequestList rl = new RequestList();
		model.addAttribute("rl", rl);
		
		List<MedicineList> lml = mls.GetMedecineList();
		model.addAttribute("lml", lml);
		
		List<MedicineTypeList> lmtl = mtls.GetMedecineTypeList();
		model.addAttribute("lmtl", lmtl);
		
		List<MedicineCategoryList> lmcl = mcls.GetMedecineCategoryList();
		model.addAttribute("lmcl", lmcl);
		
		List<SupplierList> lsl = sls.GetSupplierList();
		model.addAttribute("lsl", lsl);
		
		return "add-request";
		
	}
	
	
	@PostMapping("/saveRequestList")
	public String saveMedicineList(@ModelAttribute("rl") RequestList rl) {
		rls.saveRequestList(rl);
		return "redirect:/add-request";
	}
	
	@GetMapping("/manage-request")
	public String manageRequestList(Model model) {
		
		List<RequestList> lrl = rls.GetRequestList();
		model.addAttribute("lrl", lrl);
		
		return "manage-request";
		
	}
	
	@GetMapping("/updateRequestList/{id}")
	public String updateRequestList(@PathVariable("id") int id, Model model) {
		
		Optional<RequestList> orl = rls.GetRequestListById(id);
		model.addAttribute("orl", orl.get());
		
		List<MedicineList> lml = mls.GetMedecineList();
		model.addAttribute("lml",lml);
		
		List<MedicineTypeList> lmtl = mtls.GetMedecineTypeList();
		model.addAttribute("lmtl", lmtl);
		
		List<MedicineCategoryList> lmcl = mcls.GetMedecineCategoryList();
		model.addAttribute("lmcl", lmcl);
		
		List<SupplierList> lsl = sls.GetSupplierList();
		model.addAttribute("lsl", lsl);
		
		return "updaterql";
	}
	
	@PostMapping("/updateRequestLists/{id}")
	public String updateMedicine(@ModelAttribute("orl") RequestList rl , @PathVariable("id") int id) {
		rl.setId(id);
		rls.saveRequestList(rl);
		return "redirect:/manage-request";
	}
	
	@GetMapping("/deleteRequestList/{id}")
	public String deleteRequestListById(@PathVariable("id") int id) {
		
		rls.deleteRequestListById(id);
		
		return "redirect:/manage-request";
		
	}
	
	
	
	//RequestList
	//ends 
	
}
