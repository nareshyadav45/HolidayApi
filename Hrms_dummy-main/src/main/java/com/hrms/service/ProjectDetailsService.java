package com.hrms.service;

import java.util.List;

import com.hrms.beans.EntityBeanResponse;
import com.hrms.beans.ProjectResponseBean;
import com.hrms.entity.ProjectDetailsEntity;

public interface ProjectDetailsService {
	
	public EntityBeanResponse saveProjectDetails(ProjectDetailsEntity porjentity);
	
    // public ProjectRespoonseBean getListOfProjectDetailsByid(int client);
	
	public List<ProjectDetailsEntity> getProjectListByClienyId(int cid);
	
	
	public EntityBeanResponse updateProjectDetails(int pid,ProjectDetailsEntity entity);
	
	
	public List<ProjectResponseBean> getAllProjects(int id);
	
	
	
	
  // public EntityBeanResponse postProjectDetails(ProjectDetailsEntity entity);
}
