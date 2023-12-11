package br.com.felipesantos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped // created for one user e its available for the session being used | each browser has its own value / used for submitting data
public class CounterOne {
	
	private int value = 0;
	
	public CounterOne() {

	}
	
	public String increment() {
		value++;
		return "counter_one";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}	
}
