package br.com.felipesantos;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	
	private List<Student> students;

	public StudentDataUtil() {
		loadSampleData();
	}

	private void loadSampleData() {
		students = new ArrayList<>();		
		students.add(new Student("Mary", "Public", "mary@gmail.com"));
		students.add(new Student("John", "Doe", "john@gmail.com"));
		students.add(new Student("Ajay", "Rao", "ajay@gmail.com"));
		students.add(new Student("Felipe", "Santos", "felipe@gmail.com"));
	}
	
	public List<Student> getStudents() {
		return students;
	}
}
