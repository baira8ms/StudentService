package com.spring.examples.jpa.entities;

import java.util.List;

import javax.transaction.Transactional;
	
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.examples.jpa.pojo.Student;

@Repository
@Transactional
public interface StudentRepository extends CrudRepository<Student, Long> {

	List<Student> findByStudentID(int studentID);

	List<Student> findByCity(String city);

	Student save(Student student);

	// // custom query example and return a stream
	// @Query("select c from Customer c where c.email = :email")
	// Stream<Customer> findByEmailReturnStream(@Param("email") String email);

}