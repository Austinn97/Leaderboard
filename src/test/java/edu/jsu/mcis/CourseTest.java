package edu.jsu.mcis; 

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class StudentTest {

    @Before
	public void setUp(){
		course = new Course();
    }
    
    
	@Test
	public void testSetGetID() {
		course.setID("123232");
		assertEquals("123232", course.getID());
	}
    
    @Test
	public void testSetGetTerm() {
		course.setTerm("Spring");
		assertEquals("Spring", course.getTerm());
	}
    
    @Test
	public void testSetGetYear() {
		course.setYear("2016");
		assertEquals("2016", course.getYear());
	}
    
    @Test
	public void testSetGetSize() {
		course.setSize("18");
		assertEquals("18", course.getSize());
	}
    
    @Test
	public void testToString() {
		course.setID("123232");
        course.setTerm("Spring");
        course.setYear("2016");
        course.setSize("18");
		assertEquals("[123232] Spring 2016 (18 students)", course.toString());
	}
}