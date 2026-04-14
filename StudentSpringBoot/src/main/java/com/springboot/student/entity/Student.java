package com.springboot.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
	
	@Id
	int studId;
	String name;
	String city;
	int age;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studId, String name, String city, int age) {
		super();
		this.studId = studId;
		this.name = name;
		this.city = city;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentDao [studId=" + studId + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}


}
