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
import com.MedicineManagementSystem.models.ReturningList;
import com.MedicineManagementSystem.models.SupplierList;
import com.MedicineManagementSystem.services.MedicineListService;
import com.MedicineManagementSystem.services.ReturningService;
import com.MedicineManagementSystem.services.SupplierListService;

@Controller
public class ReturningController {

	//Returning
	//starts
	
	@Autowired
	ReturningService rs;
	
	@Autowired
	SupplierListService sls;
	
	@Autowired
	MedicineListService mls;
	
	
	@GetMapping("/add-return")
	public String getReturningList(Model model) {
		
		ReturningList r = new ReturningList();
		model.addAttribute("r", r);
		
		List<SupplierList> lsl = sls.GetSupplierList();
		model.addAttribute("lsl", lsl);
		
		List<MedicineList> lml = mls.GetMedecineList();
		model.addAttribute("lml", lml);
		
		return "add-return";
		
	}
	
	@PostMapping("/saveReturning")
	public String saveReturningList(@ModelAttribute("r") ReturningList r) {
		rs.saveReturningList(r);
		return "redirect:/add-Receiving";
	}
	
	
	@GetMapping("/manage-return")
	public String manageReturningList(Model model) {
		
		List<ReturningList> lrl = rs.GetReturningList();
		model.addAttribute("lrl",lrl);
		
		return "manage-return";
		
	}
	
	@GetMapping("/updateReturningList/{id}")
	public String updateReturningList(@PathVariable("id") int id, Model model) {
		
		Optional<ReturningList> Om = rs.GetReturningListById(id);
		model.addAttribute("r",Om.get());
		
		List<SupplierList> lsl = sls.GetSupplierList();
		model.addAttribute("lsl", lsl);
		
		List<MedicineList> lml = mls.GetMedecineList();
		model.addAttribute("lml", lml);
		
		return "updaterl";
	}
	
	@PostMapping("/updateReturningLists/{id}")
	public String updateReceiving(@ModelAttribute("r") ReturningList r , @PathVariable("id") int id) {
		r.setId(id);
		rs.saveReturningList(r);
		return "redirect:/manage-return";
	}
	
	@GetMapping("/deleteReturningList/{id}")
	public String deleteReceivingListById(@PathVariable("id") int id) {
		
		rs.deleteReturningListById(id);
		
		return "redirect:/manage-return";
		
	}
	
	
	
	//Returning
	//ends 
	
}
