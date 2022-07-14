package com.greatlearning.event.studentregistration.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="students")
public class Student {
    @Id
    Long id;
    String firstname;
    String lastname;
    String course;
    String country;
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getFirstname() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLastname() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getCourse() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getCountry() {
		// TODO Auto-generated method stub
		return null;
	}

}