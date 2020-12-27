package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raginigiri.Admin_Panel_Entity;

@Repository
public interface Admin_Panel_Repository extends JpaRepository<Admin_Panel_Entity,Integer>{

}
