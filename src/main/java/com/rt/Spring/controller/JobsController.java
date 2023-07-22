package com.rt.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rt.Spring.Entity.JobsEntity;
import com.rt.Spring.Service.JobsService;


@Controller
public class JobsController {
	@Autowired
	JobsService jobservice;
	
	@RequestMapping("/")
	public String home(){
	  return "index";	
	}
	@RequestMapping("index")
	public String backtohome(){
	  return "index";	
	}
	
	@RequestMapping("/registration")
	public String display(){
		
		return "registration";
	}
	
	@RequestMapping("/register")
	public String registerData(@ModelAttribute JobsEntity js, Model m) {
		
		boolean empAdded = jobservice.signup(js);
		
		if(empAdded){
			m.addAttribute("successMsg","Employee Added Successfully...");
		}else{
			m.addAttribute("errMsg","Unable to Add...");
		}
		
		return "registration";
	}
	

	@RequestMapping("/delete")
	public String deleteFrom() {
		return "delete";
	}
	
	@RequestMapping("/deleteRecord")
	public String delete(@RequestParam int id, Model m) {
		
		boolean empDelete = jobservice.delete(id);
		
		if(empDelete){
			m.addAttribute("successMsg","Employee Record Delete Successfully...");
		}else{
			m.addAttribute("errMsg","Unable to Delete Record...");
		}
		
		return "delete";
	}
	
	@RequestMapping("/update")
	public String updateFrom() {
		return "update";
	}
	
	@RequestMapping("/updateRecord")
	public String update(@ModelAttribute JobsEntity js, Model m) {
		
		boolean empUpdate= jobservice.update(js);
		
		if(empUpdate){
			m.addAttribute("successMsg","Employee Record update Successfully...");
		}else{
			m.addAttribute("errMsg","Unable to update Record...");
		}
		
		return "update";
	}
	
	@RequestMapping("/selectEmp")
	public String selectFrom() {
		return "selectEmp";
	}
	
	@RequestMapping("/select")
	public String select(@RequestParam int id, Model m) {
		
		JobsEntity empselect= jobservice.select(id);
		
		
			m.addAttribute("empdata",empselect);
		
		
		return "selecttable";
	}
	
	@RequestMapping("/selectAllRecord")
	public String selectAll( Model m) {
		
		List<JobsEntity> empList= jobservice.selectAll();
		
		
			m.addAttribute("empdata",empList);
		
		
		return "selectAllRecord";
	}
	
}