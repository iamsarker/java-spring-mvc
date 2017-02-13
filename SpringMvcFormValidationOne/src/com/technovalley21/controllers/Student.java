package com.technovalley21.controllers;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class Student {
	
	private String name;
	private int age;
	
	@NotEmpty(message="Please, enter NID")
	@Size(min=10, max=16, message="NID should be {min} & {max} characters")
	private String nid;
	private Date studentDoB;
	private ArrayList<String> skillList;
	private Address studentAddress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public Date getStudentDoB() {
		return studentDoB;
	}
	public void setStudentDoB(Date studentDoB) {
		this.studentDoB = studentDoB;
	}
	public ArrayList<String> getSkillList() {
		return skillList;
	}
	public void setSkillList(ArrayList<String> skillList) {
		this.skillList = skillList;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
}
