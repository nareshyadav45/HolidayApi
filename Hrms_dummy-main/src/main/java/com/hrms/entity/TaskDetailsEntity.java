package com.hrms.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="task_details")
public class TaskDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int taskid;
	
	private String tasknmae;
	
	private int is_active;
	
	@Column(name="created_date")
	private Date createddate;
	
	@Column(name="modified_date")
	private Date modifieddate;
	
	//@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@ManyToOne
	@JoinColumn(name="project_id", referencedColumnName = "projectid")
	private ProjectDetailsEntity project;
	

}
