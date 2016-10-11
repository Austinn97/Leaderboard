package edu.jsu.mcis; 

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class DataReaderTest{
	private Student student;
	private Course course;
	private DataReader reader; 

	@Before
	public void setUp(){
		reader = new DataReader();
		student = new Student();
		course = new Course();
    }
    
	@Test
	public void testGetStudentList() {
		List<Student> studentList = reader.readFile("student");
		assertEquals("111111", studentList.get(0).getID());
	}

	@Test
	public void testGetCourseList(){
		List<Course> courseList = reader.readFile("course");
		assertEquals("12345", courseList.get(0).getID());
	}

}










