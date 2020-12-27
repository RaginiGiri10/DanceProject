package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raginigiri.Teacher_Panel_Entity;
import com.service.Teacher_Panel_Service;
@RestController
public class Teacher_Panel_Controller {
	@Autowired
	private Teacher_Panel_Service service;
@PostMapping("/danceProject/teacher_panel/saveData")
	public String saveData(@RequestBody Teacher_Panel_Entity entity) {
		String saveData = service.saveData(entity);
		return saveData;
	}
@DeleteMapping("/danceProject/teacher_panel/deleteData")
	public String deleteData(@PathVariable int id) {
		return service.deleteData(id);
	}
@GetMapping("/danceProject/teacher_panel/getData")
	public Optional<Teacher_Panel_Entity> getbyid(@PathVariable int id) {
		return service.getbyid(id);
	}
}
