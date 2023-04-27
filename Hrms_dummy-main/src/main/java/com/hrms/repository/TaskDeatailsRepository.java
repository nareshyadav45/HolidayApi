package com.hrms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hrms.entity.TaskDetailsEntity;

public interface TaskDeatailsRepository extends JpaRepository<TaskDetailsEntity, Integer>{
	
	@Query("FROM TaskDetailsEntity as t WHERE t.project.projectid = :projid")
	List<TaskDetailsEntity> findByProject(@Param("projid") Integer projectid);
	

}
