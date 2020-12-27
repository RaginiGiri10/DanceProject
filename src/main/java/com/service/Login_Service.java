package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raginigiri.Login_Entity;
import com.repository.Login_Repository;
@Service
public class Login_Service {
	@Autowired
	private Login_Repository repository;

	public String saveData(Login_Entity entity) {
		repository.save(entity);
		return "Data has been saved";
	}

	public String deleteData(int id) {
		repository.deleteById(id);
		return "Data has been deleted";
	}

	public Optional<Login_Entity> getbyid(int id) {
		Optional<Login_Entity> data = repository.findById(id);
		return data;
	}

}
