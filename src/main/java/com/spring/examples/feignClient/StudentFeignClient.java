package com.spring.examples.feignClient;

import java.util.List;

import com.spring.examples.jpa.pojo.Student;

import feign.Headers;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface StudentFeignClient {

	@RequestLine("GET /rest/student/all")
	List<Student> getAllStudents();

	@Headers("Content-Type: application/json")
	@RequestLine("POST /rest/student/add")
	List<Student> addStudent(Student student);
	//
	// @Headers("Content-Type: application/json")
	// @RequestLine("PUT /v1/books/{id}")
	// Book updateBook(@Param("id") Long id, Book book);
	//
	// @RequestLine("DELETE /v1/books/{id}")
	// void deleteBook(@Param("id") Long id);

}
