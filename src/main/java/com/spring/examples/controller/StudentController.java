package com.spring.examples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.examples.jpa.entities.StudentRepository;
import com.spring.examples.jpa.pojo.Student;

@RestController
@RequestMapping(value = "/rest/student")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	// @RequestMapping(value = "/add/{name}/{sub}", method = RequestMethod.POST)
	// public List<Student> addStudent(@PathVariable ("name") String name,
	// @PathVariable ("sub") String subject) {
	//// Student two = new Student(name,name,,subject);
	//// FirstServiceApplication.hmStudent.put(two.getId(), two);
	// return null;
	// }

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public List<Student> addStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return (List<Student>) studentRepository.findAll();
	}
}
