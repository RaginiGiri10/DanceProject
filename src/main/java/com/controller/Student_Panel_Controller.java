package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raginigiri.Student_Panel_Entity;
import com.service.Student_Panel_Service;

@RestController
public class Student_Panel_Controller {
	@Autowired
	private Student_Panel_Service service;

	@PostMapping("/danceProject/student_panel/saveData")
	public String saveData(@RequestBody Student_Panel_Entity entity) {
		String saveData = service.saveData(entity);
		return saveData;
	}

	@DeleteMapping("/danceProject/student_panel/deleteData")
	public String deleteData(@PathVariable int id) {
		return service.deleteData(id);
	}

	@GetMapping("/danceProject/student_panel/getData")
	public Optional<Student_Panel_Entity> getbyid(@PathVariable int id) {
		return service.getbyid(id);
	}
}
