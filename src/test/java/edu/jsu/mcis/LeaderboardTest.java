package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class LeaderboardTest {
    
    @Before
    public void setUp() throws IOException {
		
    }
	@Test
	public void testGetStudentAndCourse(){
		Leaderboard lb = new Leaderboard("Student","111111");
		Leaderboard tb = new Leaderboard("Course","99000");
		assertEquals("[111111] Jerrod Shields jshields@jsu.edu",lb.getOutput("Student","111111"));
		assertEquals("[99000] Spring 2013 (11 students)",tb.getOutput("Course","99000"));
	}
	
}