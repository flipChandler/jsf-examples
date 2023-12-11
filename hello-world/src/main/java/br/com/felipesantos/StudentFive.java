package br.com.felipesantos;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentFive implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String favoriteLanguage;	
	
	// must have a no-args constructor
	public StudentFive() {
		firstName = "Mary";
		lastName = "Public";
		favoriteLanguage = "Ruby";
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
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
}
