package com.trax.entities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Lead;
import com.trax.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewCreateLead")
	public String viewCreateLead() {
		return "create_lead";
	}
	
	@RequestMapping(value="/saveLead",method = RequestMethod.POST)
	public String saveLead(@ModelAttribute Lead lead,ModelMap model) {
		try {
			leadService.saveLead(lead);
			model.addAttribute("lead", lead);
			return "lead_info";
		} catch (Exception e) {
			model.addAttribute("errorEmail", "Email Id Exists");
		}
		return "create_lead";
	}
	
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email")String email,ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
	}
	
	@RequestMapping("/listAllLeads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "lead_search_result";
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id")long id,ModelMap model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}
