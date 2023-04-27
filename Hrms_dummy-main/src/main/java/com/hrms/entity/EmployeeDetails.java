package com.hrms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "main_employees")
public class EmployeeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer empId;
	
	private String firstName;
	
	private String lastName;
	
	@Column(name = "dob")
	private String dateOfBirth;
	
	private String empRole;
	
	private String qualification;
	
	private String email;
	
	private String gender;

}
