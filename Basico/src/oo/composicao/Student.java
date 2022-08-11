package oo.composicao;

import java.util.ArrayList;

public class Student {
	
	//Attributes 
	final String name;
	final ArrayList<Course> courses = new ArrayList<>();
	
	//Constructors
	Student(String name) {
		this.name = name;
	}
	
	//Methods
	void addCourse(Course course) {
		
		//Add in this class
		this.courses.add(course);
		//Vincular with other class
		course.students.add(this);
	}
	
	public String toString() {
		return name;
	}
	
	Course getCursoByName(String name) {
		for(Course course : courses) {
			if(course.name.equalsIgnoreCase(name)) {
				return course;
			}
		}
		
		return null;
	}
	
}
