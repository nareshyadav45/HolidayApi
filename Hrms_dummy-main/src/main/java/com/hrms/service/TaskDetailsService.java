package com.hrms.service;



import java.util.List;

import com.hrms.beans.EntityBeanResponse;
import com.hrms.beans.TasksDetailsResponseBean;
import com.hrms.entity.TaskDetailsEntity;

public interface TaskDetailsService {
	
	public EntityBeanResponse saveTaskDeatils(TaskDetailsEntity entity);
	
	public List<TaskDetailsEntity> getTaskByProjectId(int id);
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * public EntityBeanResponse saveTaskDetails(TaskDetailsEntity entity);
	 * 
	 * public EntityBeanResponse updateTask(int id,TaskDetailsEntity entity);
	 * 
	 * public EntityBeanResponse deleteTakById(int id);
	 * 
	 * public TasksDetailsResponseBean getAllTasks();
	 */
	
	
	
	
	
	
	
	
	

}
