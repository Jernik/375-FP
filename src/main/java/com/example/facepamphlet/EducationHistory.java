package com.example.facepamphlet;

public class EducationHistory {
	private String name;
	private String graduationDate;
	public EducationHistory(String name, String graduationDate) {
		this.name = name;
		this.graduationDate = graduationDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

}
