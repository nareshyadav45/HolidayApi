package com.hrms.service;

import java.util.List;

import com.hrms.beans.EntityBeanResponse;
import com.hrms.entity.EmployeeDetails;

public interface EmployeeDetailsService {
	
	public EntityBeanResponse saveEmpDetails(EmployeeDetails employeeDetails);
	
	public List<EmployeeDetails> getAllEmpDetails();
	
	public EmployeeDetails getEmpById(Integer id);
	
	public EntityBeanResponse updateEmpDetails(EmployeeDetails employeeDetails);

}
