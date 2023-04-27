package com.hrms.controller;

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

import com.hrms.beans.ClientsResponseBean;
import com.hrms.beans.EntityBeanResponse;
import com.hrms.entity.ClientDetailsEntity;
import com.hrms.service.ClientDetailsService;

@RestController
@RequestMapping("/Client")
public class CilentDeatilsController {
	
	@Autowired
	private ClientDetailsService ClientService;
	
	//SaveClient
	@PostMapping("/saveClient")
	public EntityBeanResponse saveClientDetails(@RequestBody ClientDetailsEntity entity) {
		
		EntityBeanResponse saveClientDetails = this.ClientService.saveClientDetails(entity);
		
		return saveClientDetails;
		
	}
	
	//GetAllClients
	@GetMapping("/GetAllClients")
	public ResponseEntity<ClientsResponseBean> getallClients(){
		
		ClientsResponseBean allClients = this.ClientService.getAllClients();
		
		
	
		
		
		return new ResponseEntity<ClientsResponseBean>(allClients,HttpStatus.OK);
		
	}
	
	//GetSingleClientByClientId
	
	@GetMapping("/GetSingleClientByClientId/{clientId}")
	public ResponseEntity<ClientDetailsEntity> getSingleClientByClientId(@PathVariable("clientId") int clientId) {
		
		ClientDetailsEntity clientByClientId = this.ClientService.getClientByClientId(clientId);
		
		
		return new ResponseEntity<ClientDetailsEntity>(clientByClientId,HttpStatus.OK);
			
	}
	
	
	
	
	//delete
	@DeleteMapping("/deleteClient/{clientid}")
	public EntityBeanResponse deleteClient(@PathVariable("clientid") int id) {
		
		EntityBeanResponse deletedClient = this.ClientService.deletedClient(id);
		return deletedClient;
		
		
	}
	
	
	
	
	
	//updateById
	@PutMapping("/putClient/{cid}")
	public ClientDetailsEntity updateCliDetails(@PathVariable("cid") int id,@RequestBody ClientDetailsEntity entity) {
		
		ClientDetailsEntity updateClientById = this.ClientService.updateClientById(id, entity);
		
		
		return updateClientById;
		
	}
	
	
	
	
	
	
	
	
	
	/*
	 * @PutMapping("/update/{id}") public ResponseEntity<ClientDetailsEntity>
	 * UpdateClient(@PathVariable("id") int id,@RequestBody ClientDetailsEntity
	 * entity){
	 * 
	 * ClientDetailsEntity updateClientDetails =
	 * this.ClientService.updateClientDetails(id, entity);
	 * 
	 * return new
	 * ResponseEntity<ClientDetailsEntity>(updateClientDetails,HttpStatus.OK);
	 * 
	 * }
	 */
	
	
	
	
	/*
	 * //update
	 * 
	 * @PutMapping("/update") public EntityBeanResponse update(@RequestBody
	 * ClientDetailsEntity entity) { EntityBeanResponse updateClientDetails =
	 * this.ClientService.updateClientDetails(entity); return updateClientDetails;
	 * 
	 * }
	 */

	
	/*
	 * //updateClientDetrails
	 * 
	 * @PutMapping("/update/{Clientid}") public ResponseEntity<ClientDetailsEntity>
	 * updateClient(@PathVariable("Clientid") int id,ClientDetailsEntity entity){
	 * 
	 * ClientDetailsEntity updateClientDetrails =
	 * this.ClientService.updateClientDetrails(id, entity); return new
	 * ResponseEntity<ClientDetailsEntity>(updateClientDetrails,HttpStatus.OK);
	 * 
	 * }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * //UpdateClientDetails
	 * 
	 * @PutMapping("/updateClient") public EntityBeanResponse
	 * updateClient(@RequestBody ClientDetailsEntity updateEntity) {
	 * 
	 * EntityBeanResponse updateClient =
	 * this.ClientService.updateClient(updateEntity); return updateClient;
	 * 
	 * }
	 */
	
	
	
	

	//GetSingleClient
	
	//@GetMapping("/GetSingleClient/{id}")
	//public ResponseEntity<ClientDetailsEntity> getSingleClientByid(@PathVariable("id") int id){
		
	//	ClientDetailsEntity singleClientrByid = this.ClientService.getSingleClientrByid(id);
		
		
	//	return new ResponseEntity<ClientDetailsEntity>(singleClientrByid,HttpStatus.OK);
	
	//}
	
	
	
	
	
	
	
	
	

}
