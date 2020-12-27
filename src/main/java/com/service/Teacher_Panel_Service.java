package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raginigiri.Teacher_Panel_Entity;
import com.repository.Teacher_Panel_Repository;
@Service
public class Teacher_Panel_Service {
	@Autowired
	private Teacher_Panel_Repository repository;

	public String saveData(Teacher_Panel_Entity entity) {
		repository.save(entity);
		return "Data has been saved";
	}

	public String deleteData(int id) {
		repository.deleteById(id);
		return "Data has been deleted";
	}

	public Optional<Teacher_Panel_Entity> getbyid(int id) {
		Optional<Teacher_Panel_Entity> data = repository.findById(id);
		return data;
	}

}
