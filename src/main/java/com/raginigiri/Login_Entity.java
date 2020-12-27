package com.raginigiri;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class Login_Entity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	int id;
	@Column(name="Username")
	String Username;
	@Column(name="Password")
	String Password;
	@Column(name="ForgotPassword")
	String ForgotPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getForgotPassword() {
		return ForgotPassword;
	}
	public void setForgotPassword(String forgotPassword) {
		ForgotPassword = forgotPassword;
	}
	

}
