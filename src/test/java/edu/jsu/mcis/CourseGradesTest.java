package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class CourseGradesTest{
	private CourseGrades courseCg;
	private CourseGrades columnCg;
	private String selectedCourseId;
	private String selectedAssignment;
	
	@Before
	public void setUp(){
		selectedCourseId = "99020";
		String selectedAssignment = "Exam 1";
		courseCg = new CourseGrades(selectedCourseId);
		columnCg = new CourseGrades(selectedCourseId, selectedAssignment);
	}
	
	@Test
	public void testGetHeaders(){
		String[] headersArray = courseCg.getHeaders();
		assertEquals("Assignment 4", headersArray[4]);
	}
	
	@Test
	public void testGetGrades(){
		List<Float> grades = columnCg.getGrades();
		assertEquals(72.0, grades.get(4), 0.000001);
	}
	
	@Test
	public void testGetIds(){
		List<String> ids = columnCg.getIds();
		assertEquals("111241", ids.get(4));
	}
}