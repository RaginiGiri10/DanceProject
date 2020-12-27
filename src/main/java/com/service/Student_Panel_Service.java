package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raginigiri.Student_Panel_Entity;
import com.repository.Student_Panel_Repository;
@Service
public class Student_Panel_Service {
	@Autowired
	private Student_Panel_Repository repository;

	public String saveData(Student_Panel_Entity entity) {
		repository.save(entity);
		return "Data has been saved";
	}

	public String deleteData(int id) {
		repository.deleteById(id);
		return "Data has been deleted";
	}

	public Optional<Student_Panel_Entity> getbyid(int id) {
		Optional<Student_Panel_Entity> data = repository.findById(id);
		return data;
	}

}
