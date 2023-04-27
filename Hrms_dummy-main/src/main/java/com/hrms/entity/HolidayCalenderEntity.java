package com.hrms.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name="holiday_calender")
public class HolidayCalenderEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date date;
	
	private String holidayDescription;
	
	private String holidayName;
	
}
