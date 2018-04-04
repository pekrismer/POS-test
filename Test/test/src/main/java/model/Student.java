package model;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Student {
	
	private String nachname;
	private String vorname;
	private String adresse;
	private String postleitzahl;
	private String ort;
	private long matrikelnummer;
	
	public Student(String nachname, String vorname, String adresse, String postleitzahl, String ort,
			long matrikelnummer) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.adresse = adresse;
		this.postleitzahl = postleitzahl;
		this.ort = ort;
		this.matrikelnummer = matrikelnummer;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(String postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public long getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(long matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}
	
	private long creatMatrikelnummer() {
		long matrikelnummer = 0;
		Random ran = new Random();
		int jahr =  Calendar.YEAR;
		return matrikelnummer;
	}
	

	
}
