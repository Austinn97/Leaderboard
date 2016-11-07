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
	public void testGetArtifactList(){
		List<String> artifacts = cG.getArtifact();
		assertEquals("Total", artifacts.get(0));
		assertEquals("Exam1", artifacts.get(artifacts.size()-1));
	}
	
	

}