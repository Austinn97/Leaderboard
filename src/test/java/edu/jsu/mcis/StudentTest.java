package edu.jsu.mcis; 

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class StudentTest {
	private Student student; 

    @Before
	public void setUp(){
		student = new Student();
    }
    
    
	@Test
	public void testSetGetID() {
		student.setID("111111");
		assertEquals("111111", student.getID());
	}
    
    @Test
	public void testSetGetFirstName() {
		student.setFirstName("Jerrod");
		assertEquals("Jerrod", student.getFirstName());
	}
    
    @Test
	public void testSetGetLastName() {
		student.setLastName("Shields");
		assertEquals("Shields", student.getLastName());
	}
    
    @Test
	public void testSetGetEmail() {
		student.setEmail("jshields");
		assertEquals("jshields", student.getEmail());
	}
    
    @Test
	public void testToString() {
		student.setID("111111");
        student.setFirstName("Jerrod");
        student.setLastName("Shields");
        student.setEmail("jshields");
        assertEquals("[111111] Jerrod Shields 
        jshields@jsu.edu", student.toString());
	}
}