package com.test.thirdjan.model;

import java.io.Serializable;

public class Subject implements Serializable{

	private int subId;
	private String name;
	private SubSubject subSubject;
	
	public SubSubject getSubSubject() {
		return subSubject;
	}

	public void setSubSubject(SubSubject subSubject) {
		this.subSubject = subSubject;
	}

	public int getSubId() {
		return subId;
	}
	
	public void setSubId(int subId) {
		this.subId = subId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
