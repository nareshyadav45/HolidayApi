package com.hrms.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.entity.HolidayCalenderEntity;

public interface HolidayCalenderRepository extends JpaRepository<HolidayCalenderEntity, Integer>{

	//HolidayCalenderEntity save(HolidayCalenderEntity holiday);
	
	
	
	//getHloidayByName
	public HolidayCalenderEntity findByDate(Date date);
		

}
