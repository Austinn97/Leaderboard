package edu.jsu.mcis; 

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class DataReaderTest{
	private DataReader reader; 
	private Course course;

	@Before
	public void setUp() throws IOException{
		reader = new DataReader();
    }
    
	@Test
	public void testGetStudentByID() {
		Student s = reader.getStudent("111111");
		assertEquals("111111", s.getID());
		assertEquals("Jerrod", s.getFirstName());
		assertEquals("Shields", s.getLastName());
		assertEquals("jshields", s.getEmail());
	}

	@Test
	public void testGetCourseByID(){
		Course course = reader.getCourse("99000");
		assertEquals("99000", course.getID());
		assertEquals("Spring", course.getTerm());
		assertEquals("2013", course.getYear());
		assertEquals("11", course.getSize());
	}

	@Test
	public void testGetCourseList(){
		List<Course> courseList = new ArrayList<Course>();
		courseList = reader.getCourseList();
		Course first = new Course("99000", "Spring", "2013", "11");
		assertTrue(first.toString().equals(courseList.get(0).toString()));
		Course last = new Course("99024", "Fall", "2014", "9");
		assertTrue(last.toString().equals(courseList.get(courseList.size()-1).toString()));
	}
	@Test
	public void takeStudentIds(){
		List<Student> studentList = new ArrayList<Student>();
		studentList = reader.getStudentList();
		String[] studentId = new String[studentList.size()];
		studentId = reader.getStudentId(studentList);
		assertEquals("111111",studentId[0]);
		assertEquals("111410",studentId[studentList.size()-1]);
	}
	
	@Test
	public void takeCourseIds(){
		List<Course> courseList = new ArrayList<Course>();
		courseList = reader.getCourseList();
		String[] courseId = new String[courseList.size()];
		courseId = reader.getCourseId(courseList);
		assertEquals("99000",courseId[0]);
		assertEquals("99024",courseId[courseList.size()-1]);
	}

	/*@Test
	public void readFirstFile(){
		List<CourseGrades> courseGrades = new ArrayList<CourseGrades>;
		courseGrades = reader.getCourseGrades();
		String[] courseGradesId = new String[courseGrades.size()];
		courseGradesId = reader.getCourseGradesId(courseGrades);
		assertEquals("111318",courseGradesId[0]);
		assertEquals("111262",courseGradesId[courseGrades.size()-1]);
		
	}*/

}










