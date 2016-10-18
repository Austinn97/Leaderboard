package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class MainTest {
    private Student student;
    private Course course;
    
    @Before
    public void SetUp() throws IOException {
        student = new Student();
        course = new Course();
    }
    
    @Test
    public void testFindStudentCourse() {
        Main main = new Main("Course", "111111");
        assertEquals("[111111] Jerrod Shields jshields@jsu.edu",
        course.getArgs());
    }
    
    @Test
    public void testFindStudentUsingId() {
        Main main = new Main("Student", "111111");
        assertEquals("[99000] Spring 2013 (11 students)",
        course.getArgs());
    }
}