package com.example.facepamphlet;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;

public class WorkHistoryTest {

FacePamphletProfile p = new FacePamphletProfile("Louie");
	
	@Test
	public void testAddWorkHistory(){
		p.addWorkHistory("Work Place", "01-12-1925", "01-12-1935");
		p.addWorkHistory("Work Place 2: Electric Boogaloo", "01-12-1935", "01-12-1945");
		p.addWorkHistory("Work Place 3: work harder", "01-12-1945", "01-12-1955");
		Iterator<WorkHistory> i = p.getWorkHistory();
		assertTrue(i.next().getHistoryName().equals("Work Place"));
		assertTrue(i.next().getStartDate().equals("01-12-1935"));
		assertTrue(i.next().getEndDate().equals("01-12-1955"));
	}
}
