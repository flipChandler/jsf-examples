package br.com.felipesantos;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	
	// must have a no-args constructor
	public Student() {
	
	}	
	
	// must have getters and setters to bind with .xhtml page
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
