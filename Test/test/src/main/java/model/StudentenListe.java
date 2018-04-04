package model;

import java.util.ArrayList;

public class StudentenListe {
	private ArrayList<Student> studenten;

	public StudentenListe(ArrayList<Student> studenten) {
		super();
		this.studenten = studenten;
	}

	public ArrayList<Student> getStudenten() {
		return studenten;
	}

	public void setStudenten(ArrayList<Student> studenten) {
		this.studenten = studenten;
	}
	
	public void addStudent(Student student) {
		this.studenten.add(student);
	}
	
	public Student getStudent(long matrizelnummer) {
		Student gesuchterStudent = null;
		for (Student student : studenten) {
			if(student.getMatrikelnummer() == matrizelnummer){
				gesuchterStudent = student;
			}
		}
		return gesuchterStudent;
	}
	
	
	

}
