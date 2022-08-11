package oo.composicao;

import java.util.ArrayList;

public class Course {
	
	//Atributos 
	final String name;
	final ArrayList<Student> students = new ArrayList<>();
	
	//Constructors
	Course(String name) {
		this.name = name;
	}
	
	//Methods
	void addStudent(Student student) {
		
		//Add in this class
		this.students.add(student);
		//Vincular with other class
		student.courses.add(this);
	}
	
	public String toString() {
		return name;
	}
}
