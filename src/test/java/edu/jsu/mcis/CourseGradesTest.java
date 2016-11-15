package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class CourseGradesTest{
	
	private CourseGrades cG;
	
	/*@Before
	public void setUp(){
		cG = new CourseGrades("/src/test/resources/courses/99000.csv");		
    } 
	
	@Test
	public void testGetAssignmentList(){
		List<String> artifacts = cG.getHeader();
		assertEquals("Total", artifacts.get(0));
		assertEquals("Exam1", artifacts.get(artifacts.size()-1));
	}*/
	
	@Test
	public void testGetGrade() {
		float g = cG.getGrade("111111", "Total");
		assertEquals(42.0, g, 0.000001);
	}
	
	@Test
	public void testGetColumn() {
		List<Float> expected = ...
		List<Float> col = cG.getColumn("Assignment 1");
	}
	
	@Test
	public void testGetRow() {
		List<Float> row = cG.getRow("111111");
	}
	
	

}