package com.hrms.service;

import java.sql.Date;
import java.util.List;

import com.hrms.beans.EntityBeanResponse;
import com.hrms.entity.HolidayCalenderEntity;

public interface HolidayCalenderService {
	
	
	public EntityBeanResponse saveHoliday(HolidayCalenderEntity holiday);
	
	public List<HolidayCalenderEntity> getAllHolidays();
	
	/*
	 * public HolidayCalenderEntity UpdateHoliday(HolidayCalenderEntity
	 * updateHoliday);
	 */
	
	public HolidayCalenderEntity updateHoliday(int id,HolidayCalenderEntity updateHoliday);
	
	public HolidayCalenderEntity getHolidayBydate(Date date);

    public HolidayCalenderEntity getHolidayById(int id);
    
    public EntityBeanResponse deleteHoliday(int id);
    
	

}
