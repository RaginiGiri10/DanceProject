package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raginigiri.Admin_Panel_Entity;
import com.repository.Admin_Panel_Repository;

@Service
public class Admin_Panel_Service {
	@Autowired
	private Admin_Panel_Repository repository;

	public String saveData(Admin_Panel_Entity entity) {
		repository.save(entity);
		return "Data has been saved";
	}

	public String deleteData(int id) {
		repository.deleteById(id);
		return "Data has been deleted";
	}

	public Optional<Admin_Panel_Entity> getbyid(int id) {
		Optional<Admin_Panel_Entity> data = repository.findById(id);
		return data;
	}
}
