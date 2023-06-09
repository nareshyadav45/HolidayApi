package com.hrms.controller;

import java.sql.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.beans.EntityBeanResponse;
import com.hrms.entity.HolidayCalenderEntity;
import com.hrms.service.HolidayCalenderService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/holiday")
@Slf4j
public class HolidayCalenderController {

//	Logger log = LoggerFactory.getLogger(HolidayCalenderController.class);

	@Autowired
	private HolidayCalenderService service;
    
	//save Holiday
	@PostMapping("/Save")
	public EntityBeanResponse saveHoliday(@RequestBody HolidayCalenderEntity holiday) {
		log.info("Entered savehlodiay method in Controller");
		EntityBeanResponse saveHoliday = service.saveHoliday(holiday);
		log.info("successfully saved holiday in controller");
		return saveHoliday;

	}
	 
	
    //GetAllHolidays
	@GetMapping("/GetHolidays")
	public ResponseEntity<List<HolidayCalenderEntity>> getAllHolidays() {

		log.info("Entered Get holidays Method in controller");

		List<HolidayCalenderEntity> allHolidays = service.getAllHolidays();

		// return new ResponseEntity<>(allHolidays,HttpStatus.OK.
		// valueOf("Successfully Hlodays retrived"));

		log.info("successfully fetched Hloidays in controlller");

		return new ResponseEntity<>(allHolidays, HttpStatus.OK);
	}
	
	
	//update
	@PutMapping("/UpdateHoliday/{id}")
	public ResponseEntity<HolidayCalenderEntity> updateHoliday(@PathVariable("id") int id,@RequestBody HolidayCalenderEntity entity) {
		
		log.info("Entered Update Holiday method in controller");
		
		HolidayCalenderEntity updateHoliday = this.service.updateHoliday(id, entity);
		
		log.info("Successfully Upadted Holiday in controller");
		
		return new ResponseEntity<>(updateHoliday,HttpStatus.OK);
		
	}
	
	
	
	//GetSingleHolidayByName
	@GetMapping("/GetSingleHolidayByname/{HolidayDate}")
	public ResponseEntity<HolidayCalenderEntity> getHolidayByDate(@PathVariable("HolidayDate") Date HolidayDate){
		
		log.info("Entered Get Holiday By Date method in Controller");
		
		HolidayCalenderEntity holidayByName = this.service.getHolidayBydate(HolidayDate);
		
	log.info("Successfully fetched Holiday By Date in contoller");
		
		return new ResponseEntity<>(holidayByName,HttpStatus.OK);
		
		
		
	}
	
   //GetSinglrHolidayById
	@GetMapping("/GetById/{id}")
	public ResponseEntity<HolidayCalenderEntity> getById(@PathVariable("id") int id){
		
		log.info("Entered Get Holiday By Id in controller ");
		
		HolidayCalenderEntity holidayById = this.service.getHolidayById(id);
		

		log.info("Successfully Get Holiday By Id in controller");
		
		return  new ResponseEntity<HolidayCalenderEntity>(holidayById, HttpStatus.OK);
		
	}
	
	
	//DeleteHolidayByid
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<EntityBeanResponse> deleteByid(@PathVariable("id") int id){
		
		log.info("Entered DeleteHoliday By id in controller");
		
		EntityBeanResponse deleteHoliday = this.service.deleteHoliday(id);
		
		log.info("Successfully Deleted Holiday By id in controller");
		
		return new ResponseEntity<>(deleteHoliday,HttpStatus.OK);
		
	}
	
	
	
	
	
	
}
