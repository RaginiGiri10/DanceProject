package com.raginigiri;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teacher_Panel")
public class Teacher_Panel_Entity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	int id;
	@Column(name="Name")
	String Name;
	@Column(name="Age")
	int Age;
	@Column(name="Gender")
	String Gender;
	@Column(name="Email")
	String Email;
	@Column(name="MobileNumber")
	long MobileNumber;
	@Column(name="Profession")
	String Profession;
	@Column(name="DanceStyle_SingingStyle")
	String DanceStyle_SingingStyle;
	@Column(name="Address")
	String Address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	public String getDanceStyle_SingingStyle() {
		return DanceStyle_SingingStyle;
	}
	public void setDanceStyle_SingingStyle(String danceStyle_SingingStyle) {
		DanceStyle_SingingStyle = danceStyle_SingingStyle;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	

}
