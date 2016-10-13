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
	public void setUp() throws IOException{
		reader = new DataReader();
		student = new Student();
		course = new Course();
    }
    
	@Test
	public void testGetStudentID() {
		List<Student> studentList = reader.getStudentList();
		assertEquals("111111", studentList.get(0).getID());
	}

	@Test
	public void testGetStudentFirstName() {
		List<Student> studentList = reader.getStudentList();
		assertEquals("Jerrod", studentList.get(0).getFirstName());
	}

	@Test
	public void testGetStudentLastName() {
		List<Student> studentList = reader.getStudentList();
		assertEquals("Shields", studentList.get(0).getLastName());
	}

	@Test
	public void testGetStudentEmail() {
		List<Student> studentList = reader.getStudentList();
		assertEquals("jshields", studentList.get(0).getEmail());
	}

	@Test
	public void testGetCourseID(){
		List<Course> courseList = reader.getCourseList();
		assertEquals("99000", courseList.get(0).getID());
	}

	@Test
	public void testGetCourseTerm(){
		List<Course> courseList = reader.getCourseList();
		assertEquals("Spring", courseList.get(0).getTerm());
	}

	@Test
	public void testGetCourseYear(){
		List<Course> courseList = reader.getCourseList();
		assertEquals("2013", courseList.get(0).getYear());
	}

	@Test
	public void testGetCourseSize(){
		List<Course> courseList = reader.getCourseList();
		assertEquals("11", courseList.get(0).getSize());
	}

}










