package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class CourseGradesTest{
	
	private CourseGrades courseGrades;
	
	@Before
	public void setUp(){
		courseGrades = new CourseGrades();
    }
	
	/*@Test
	public void testTheFirstLine(){
		courseGrades c = courseGrades.setId("111318");
		assertEquals("111318",c.getId());
	}*/
}