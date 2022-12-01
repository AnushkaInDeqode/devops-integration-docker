package com.test.thirdjan.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.thirdjan.model.Student;
import com.test.thirdjan.model.SubSubject;
import com.test.thirdjan.model.Subject;
import com.test.thirdjan.model.Topic;



@RestController
@RequestMapping(value="/api")

public class StudentController {

	@GetMapping(value="/student")
		public HashMap<Integer, Student> getStudent(){
			
		//creating hashmap
		HashMap<Integer, Student> stMap=new HashMap<Integer, Student>();
			
		//setting student values and sending to its constructor
		Student st = new Student(1, "Anushka", "Prayagraj", 977087);
		
		//setting objects
		Subject subject=new Subject();
		SubSubject subSubject= new SubSubject();
		Topic topic=new Topic();
		
		//setting values to hashmap
		stMap.put(1, st);
		
		//setting subject to hashmap
		subject.setSubId(1000);
		subject.setName("Programming");
		
		//setting subsubject to hashmap
		subSubject.setSubSubId(1001);
		subSubject.setSubName("Java");
		
		//setting topics
		topic.setTopicId(10010);
		topic.setTopicName("Polymorphism");
		
		st.setSubject(subject);
		subject.setSubSubject(subSubject);
		subSubject.setTopic(topic);
		
		return stMap;
		
	}
}
