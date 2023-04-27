package com.hrms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.beans.EntityBeanResponse;
import com.hrms.beans.TasksDetailsResponseBean;
import com.hrms.entity.TaskDetailsEntity;
import com.hrms.repository.ProjectDetailsRepository;
import com.hrms.repository.TaskDeatailsRepository;

@Service
public class TaskDetailsServiceImpl implements TaskDetailsService {
	
	@Autowired
	private TaskDeatailsRepository taskRepo;
	
	@Autowired
	private ProjectDetailsRepository projrepo;
	
	@Autowired
	private EntityBeanResponse beanResponse;
	
	@Autowired
	private TasksDetailsResponseBean taskbean;

	
	
	@Override
	public EntityBeanResponse saveTaskDeatils(TaskDetailsEntity entity) {
		
		TaskDetailsEntity save = this.taskRepo.save(entity);
		if(save!=null) {
			beanResponse.setMsg("successfully saved Task details");
			beanResponse.setStatus(true);
			
		}else {
			beanResponse.setMsg("Failed to save task details");
			beanResponse.setStatus(false);
			
		}
		
		return beanResponse;
	}


   //fetchTasksByProjectId
	@Override
	public List<TaskDetailsEntity> getTaskByProjectId(int id) {
		
		List<TaskDetailsEntity> listtasks = this.taskRepo.findByProject(id);
		
		return listtasks;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//@Override
	//public EntityBeanResponse saveTaskDetails(TaskDetailsEntity entity) {
		
		
	 //TaskDetailsEntity save = this.taskRepo.save(entity);
		//if(save!=null) {
	//		beanResponse.setMsg("Task Details Successfully saved");
			//beanResponse.setStatus(true);
		//}else {
		//	beanResponse.setMsg("Task Details not saved..");
		//	beanResponse.setStatus(false);
		//}
		//return beanResponse;
	//}



	//@Override
	//public EntityBeanResponse updateTask(int id, TaskDetailsEntity entity) {
		
		//Optional<TaskDetailsEntity> findById = this.taskRepo.findById(id);
		//if(entity!=null) {
			//findById.orElseThrow().setTaskid(entity.getTaskid());
			//findById.orElseThrow().setTasknmae(entity.getTasknmae());
			//findById.orElseThrow().setCreateddate(entity.getCreateddate());
			//findById.orElseThrow().setModifieddate(entity.getModifieddate());
			//findById.orElseThrow().setIs_active(entity.getIs_active());
			
			//this.taskRepo.save(findById.orElseThrow());
			//beanResponse.setMsg("successfully updated task details");
			//beanResponse.setStatus(true);
		//}else {
			
			//beanResponse.setMsg("Failed to update Task detils");
			//beanResponse.setStatus(false);
			
		//}
		
		//return beanResponse;
	//}



	//@Override
	//public EntityBeanResponse deleteTakById(int id) {
		//Optional<TaskDetailsEntity> findById = this.taskRepo.findById(id);
		//this.taskRepo.delete(findById.orElseThrow());
		//beanResponse.setMsg("successfully Task Deleted Id :"+id);
		//beanResponse.setStatus(true);
		
		
		//return beanResponse;
	//}



	//@Override
	//public TasksDetailsResponseBean getAllTasks() {
		//List<TaskDetailsEntity> findAll = this.taskRepo.findAll();
		
		//if(!findAll.isEmpty()) {
			//taskbean.setMessage("successfully all  fetched task details ");
			//taskbean.setStatus(true);
			//taskbean.setListOfTask(findAll);
		//}else {
			//taskbean.setMessage("failed to fetch the all task details");
			//taskbean.setStatus(false);
		//}
		
		
		//return taskbean;
	//}



	

}
