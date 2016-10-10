package edu.jsu.mcis; 

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class LeaderboardTest{
	private String csvStudentString;
	private String csvCourseString;
	private String line;  
	private Data board; 

	

	@Before
	public void setUp(){
		board = new Data();
		try{
			csvStudentString = board.readFile("src/test/resources/students.csv");
			csvCourseString =  board.readFile("src/test/resources/courses.csv");
		}
		catch(IOException e){}
	}

	@Test
	public void testReadsInStudentIDCorrectly(){
		assertEquals("111111", board.getStudentID()); 
	}

}