package com.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.beans.EntityBeanResponse;
import com.hrms.entity.EmployeeDetails;
import com.hrms.service.EmployeeDetailsService;

@RestController
public class EmployeeDetailsController {
	
	@Autowired
	private EmployeeDetailsService empService;
	

	@PostMapping("/saveEmployee")
	public EntityBeanResponse saveEmpDetails(@RequestBody EmployeeDetails empDetails){
		
		return empService.saveEmpDetails(empDetails);

	}
	
	@GetMapping("/getEmployeeDetails")
	public ResponseEntity<List<EmployeeDetails>> getAllEmployeeDetails(){
		List<EmployeeDetails> allEmpDetails = empService.getAllEmpDetails();
		return new ResponseEntity<> (allEmpDetails, HttpStatus.OK);
	}
	
	@GetMapping("/getEmployeeDetail/{id}")
	public ResponseEntity<EmployeeDetails> getEmployeeById(@PathVariable Integer id){
		EmployeeDetails empById = empService.getEmpById(id);
		return new ResponseEntity<> (empById, HttpStatus.OK);
	}
     @PutMapping("/updateEmployeeDetails")
	public EntityBeanResponse updateEmplyee(@RequestBody EmployeeDetails empDetails){
		return empService.updateEmpDetails(empDetails);
	}
}
