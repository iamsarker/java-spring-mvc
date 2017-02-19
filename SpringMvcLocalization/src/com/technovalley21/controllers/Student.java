package com.technovalley21.controllers;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class Student {
	
	@Pattern(regexp="[^0-9]*")
	private String name;
	
	@Max(26)
	@Min(15)
	private int age;
		
	/*
	 * {0} == object property/field name
	 * {1}, {2}, {3} .... == annotation arguments with alphabetic order. i.e max is upon min.
	 * 
	 * */
	
	@Size(min=10, max=16)
	private String nid;
	
	@Past // @Future
	private Date studentDoB;
	private ArrayList<String> skillList;
	private Address studentAddress;
	
	@IsValidDept(listOfValidDept="IT")
	private String dept;
	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
