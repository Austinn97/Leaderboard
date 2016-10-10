package edu.jsu.mcis; 

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class LeaderboardTest{
	private String csvStudentString;
	private String csvCourseString;
	private String line;  
	private DataReader data; 
	private Student student;
	private Course course; 	

	@Before
	public void setUp(){
		data = new DataReader();
		student = new Student();
	}

	@Test
	public void testReadsInStudentIDCorrectly(){
		assertEquals(contains()"111111", data.readFile()); 
	}

	@Test
	public void testSetGetID() {
		Student s = new Student();
		s.setID("123232");
		assertEquals("123232", s.getID());
	}


	@Test
	public void testGetStudentList() {
		DataReader r = new DataReader();
		List<Student> stulist = r.readFile("student");
		assertEquals("111111", stulist.get(0).getID());
	}

}










