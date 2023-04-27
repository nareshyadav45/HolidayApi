package com.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hrms.beans.EntityBeanResponse;
import com.hrms.beans.TasksDetailsResponseBean;
import com.hrms.entity.TaskDetailsEntity;
import com.hrms.service.TaskDetailsService;

@RestController
@RequestMapping("/task")
public class TaskDetailsController {


	@Autowired
	private TaskDetailsService service;

	@PostMapping("/savetask")
	public EntityBeanResponse saveTask(@RequestBody TaskDetailsEntity entity) {
		
		EntityBeanResponse saveTaskDeatils = this.service.saveTaskDeatils(entity);
		
		return saveTaskDeatils;
		
		
	}
	
	@GetMapping("/gettasks/{id}")
	public List<TaskDetailsEntity> getAllTasks(@PathVariable("id") int id){
		
		List<TaskDetailsEntity> taskByProjectId = this.service.getTaskByProjectId(id);
		return taskByProjectId;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@PostMapping("/saveTask")
	//public EntityBeanResponse saveTaskdetails(@RequestBody TaskDetailsEntity entity) {

		//EntityBeanResponse saveTaskDetails = this.service.saveTaskDetails(entity);

		//return saveTaskDetails;

	//}

	//@PutMapping("/updateTask/{id}")
	//public EntityBeanResponse updateTaskDetails(@PathVariable("id") int id,@RequestBody TaskDetailsEntity entity) {

		//EntityBeanResponse updateTaskDetails = this.service.updateTask(id, entity);

		//return updateTaskDetails;

	//}

	//@DeleteMapping("/delete/{id}")
	//public EntityBeanResponse deleteTaskByid(@PathVariable("id") int id) {
	//	EntityBeanResponse deleteTakById = this.service.deleteTakById(id);
		//return deleteTakById;

	//}


	//@GetMapping("/getalltasks")
	//public TasksDetailsResponseBean GetAllTasks() {

		//TasksDetailsResponseBean allTasks = this.service.getAllTasks();

		//return allTasks;

//	}
}
