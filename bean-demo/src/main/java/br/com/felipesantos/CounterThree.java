package br.com.felipesantos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped // new bean is created for every request | when incremented, the value displayed will be always 1
public class CounterThree {
	
	private int value = 0;
	
	public CounterThree() {

	}
	
	public String increment() {
		value++;
		return "counter_three";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}	
}
