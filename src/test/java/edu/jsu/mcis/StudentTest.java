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
		student.setID("123232");
		assertEquals("123232", student.getID());
	}
    
    @Test
	public void testSetGetFirstName() {
		student.setFirstName("George");
		assertEquals("George", student.getFirstName());
	}
    
    @Test
	public void testSetGetLastName() {
		student.setLastName("Brady");
		assertEquals("Brady", student.getLastName());
	}
    
    @Test
	public void testSetGetEmail() {
		student.setEmail("gbrady");
		assertEquals("gbrady", student.getEmail());
	}
    
    @Test
	public void testToString() {
		student.setID("123232");
        student.setFirstName("George");
        student.setLastName("Brady");
        student.setEmail("gbrady");
		assertEquals("[123232] George Brady gbrady@jsu.edu", student.toString());
	}
}