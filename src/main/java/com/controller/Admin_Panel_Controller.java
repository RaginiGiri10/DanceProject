package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raginigiri.Admin_Panel_Entity;
import com.service.Admin_Panel_Service;
@RestController
public class Admin_Panel_Controller {
	@Autowired
	private Admin_Panel_Service service;
@PostMapping("/danceProject/admin_panel/saveData")
	public String saveData(@RequestBody Admin_Panel_Entity entity) {
		String saveData = service.saveData(entity);
		return saveData;
	}
@DeleteMapping("/danceProject/admin_panel/deleteData")
	public String deleteData(@PathVariable int id) {
		return service.deleteData(id);
	}
@GetMapping("/danceProject/admin_panel/getData")
	public Optional<Admin_Panel_Entity> getbyid(@PathVariable int id) {
		return service.getbyid(id);
	}
}
