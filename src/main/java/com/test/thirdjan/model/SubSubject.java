package com.test.thirdjan.model;

import java.io.Serializable;

public class SubSubject implements Serializable{
	
	private int subSubId;
	private String subName;
	private Topic topic;
		
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public int getSubSubId() {
		return subSubId;
	}
	
	public void setSubSubId(int subSubId) {
		this.subSubId = subSubId;
	}
	
	public String getSubName() {
		return subName;
	}
	
	public void setSubName(String subName) {
		this.subName = subName;
	}
	
}
