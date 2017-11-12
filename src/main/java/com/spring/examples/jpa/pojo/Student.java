package com.spring.examples.jpa.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STUD_SEQ")
    @SequenceGenerator(sequenceName = "student_sequence", allocationSize = 1, name = "STUD_SEQ")
    int studentID;

    String last_name;
    String first_name;
    String subject;
    String address;
    String city;
    
    public Student(String last_name,String first_name,String subject, String address, String city) {
		this.first_name = first_name;
		this.last_name= last_name;
		this.subject = subject;
		this.city = city;
		this.address =address;
	}
}