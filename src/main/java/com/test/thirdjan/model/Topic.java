package com.test.thirdjan.model;

import java.io.Serializable;

public class Topic implements Serializable{

	private int topicId;
	private String topicName;
	
	public int getTopicId() {
		return topicId;
	}
	
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
	public String getTopicName() {
		return topicName;
	}
	
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
}
