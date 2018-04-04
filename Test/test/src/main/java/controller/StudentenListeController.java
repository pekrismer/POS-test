package controller;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import model.StudentenListe;

@SessionScoped
@Named 
public class StudentenListeController {
	private StudentenListe list;
	
	
	
	public StudentenListe doAddStudent() {
		list.addStudent(student);
	}

}
