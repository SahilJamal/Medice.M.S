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
import com.MedicineManagementSystem.models.Receiving;
import com.MedicineManagementSystem.models.SupplierList;
import com.MedicineManagementSystem.services.MedicineListService;
import com.MedicineManagementSystem.services.ReceivingService;
import com.MedicineManagementSystem.services.SupplierListService;

@Controller
public class ReceivingController {

	//Receiving
	//starts
	
	
	@Autowired
	ReceivingService rs;
	
	@Autowired
	SupplierListService sls;
	
	@Autowired
	MedicineListService mls;
	
	@GetMapping("/add-Receiving")
	public String getReceivingList(Model model) {
		
		Receiving r = new Receiving();
		model.addAttribute("r", r);
		
		List<SupplierList> lsl = sls.GetSupplierList();
		model.addAttribute("lsl", lsl);
		
		List<MedicineList> lml = mls.GetMedecineList();
		model.addAttribute("lml", lml);
		
		return "add-receive";
		
	}
	
	@PostMapping("/saveReceiving")
	public String saveReceivingList(@ModelAttribute("r") Receiving r) {
		rs.saveReceivingList(r);
		return "redirect:/add-Receiving";
	}
	
	
	@GetMapping("/manage-receive")
	public String manageReceivingList(Model model) {
		
		List<Receiving> lr = rs.GetReceivingList();
		model.addAttribute("lr", lr);
		
		return "manage-receive";
		
	}
	
	@GetMapping("/updateReceivingList/{id}")
	public String updateReceivingList(@PathVariable("id") int id, Model model) {
		
		Optional<Receiving> Om = rs.GetReceivingListById(id);
		model.addAttribute("r",Om.get());
		
		List<SupplierList> lsl = sls.GetSupplierList();
		model.addAttribute("lsl", lsl);
		
		List<MedicineList> lml = mls.GetMedecineList();
		model.addAttribute("lml", lml);
		
		return "updater";
	}
	
	@PostMapping("/updateReceivingLists/{id}")
	public String updateReceiving(@ModelAttribute("r") Receiving r , @PathVariable("id") int id) {
		r.setId(id);
		rs.saveReceivingList(r);
		return "redirect:/manage-receive";
	}
	
	@GetMapping("/deleteReceivingList/{id}")
	public String deleteReceivingListById(@PathVariable("id") int id) {
		
		rs.deleteReceivingListById(id);
		
		return "redirect:/manage-receive";
		
	}
	
	
	//Receiving
	//ends
}
