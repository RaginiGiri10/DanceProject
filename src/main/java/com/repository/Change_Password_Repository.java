package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raginigiri.Change_Password_Entity;
@Repository
public interface Change_Password_Repository extends JpaRepository<Change_Password_Entity,Integer>{

}
