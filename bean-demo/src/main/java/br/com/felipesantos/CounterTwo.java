package br.com.felipesantos;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped // for services, created one time and available for the whole application
public class CounterTwo {
	
	private int value = 0;
	
	public CounterTwo() {

	}
	
	public String increment() {
		value++;
		return "counter_two";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}	
}
