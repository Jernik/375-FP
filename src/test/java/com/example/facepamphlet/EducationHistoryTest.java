package com.example.facepamphlet;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Iterator;

public class EducationHistoryTest {
	

	FacePamphletProfile p = new FacePamphletProfile("Louie");
	
	@Test
	public void testAddEducationHistory(){
		p.addEducationHistory("School University", "01-12-1925");
		p.addEducationHistory("School Master Program", "03-30-1926");
		Iterator<EducationHistory> i = p.getEducationHistory();
		assertTrue(i.next().getName().equals("School University"));
		assertTrue(i.next().getGraduationDate().equals("03-30-1926"));
	}

}
