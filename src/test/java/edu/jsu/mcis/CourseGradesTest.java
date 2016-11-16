package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class CourseGradesTest{
	
	private CourseGrades cG;
	
	@Before
	public void setUp(){
		cG = new CourseGrades("/src/test/resources/courses/99000.csv");		
    }
	
	@Test
	public void testGetGrade() {
		//List<Float> g = cG.getGrades("111318", "Assignment 1");
		//assertEquals(65.0, g, 0.000001);
	}
	/*@Test
	public void testGetTotal(){
		float g = cG.getTotal("111318");
		assertEquals(925.0,g,0.000001);
	} */
	
	/*@Test
	public void testGetColumn() {
		List<Float> expected = ...
		List<Float> col = cG.getColumn("Assignment 1");
	}
	
	@Test
	public void testGetRow() {
		List<Float> row = cG.getRow("111111");
	}*/
	
	

}