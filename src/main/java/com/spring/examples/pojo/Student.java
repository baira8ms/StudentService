package com.spring.examples.pojo;

import lombok.Data;

@Data
public class Student {

	public Student(String name, String subject) {
		this.id = System.currentTimeMillis();
		this.name = name;
		this.subject = subject;
	}

	private long id;

	private String name;

	private String subject;
}
