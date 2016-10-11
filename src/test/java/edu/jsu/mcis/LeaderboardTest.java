package edu.jsu.mcis; 

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class LeaderboardTest{

	@Before
	public void setUp(){
		reader = new DataReader();
		student = new Student();
    }
    
	@Test
	public void testGetStudentList() {
		List<Student> stulist = reader.readFile("student");
		assertEquals("111111", stulist.get(0).getID());
	}

}










