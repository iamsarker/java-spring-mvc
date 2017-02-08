package com.technovalley21.controllers;

import java.util.ArrayList;
import java.util.Date;

public class Student {
	private String name;
	private int age;
	private String nid;
	private Date studentDoB;
	private ArrayList<String> skillList;
	
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
	
	
}
