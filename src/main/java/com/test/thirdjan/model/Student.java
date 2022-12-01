package com.test.thirdjan.model;

/*
*
* @author anushka
* @since 2021
* @version 1.0
* 
*/

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String add;
	private int pno;
	
	private Subject subject;
	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAdd() {
		return add;
	}
	
	public void setAdd(String add) {
		this.add = add;
	}
	
	public int getPno() {
		return pno;
	}
	
	public void setPno(int pno) {
		this.pno = pno;
	}

	public Student(int id, String name, String add, int pno) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.pno = pno;
	}	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
