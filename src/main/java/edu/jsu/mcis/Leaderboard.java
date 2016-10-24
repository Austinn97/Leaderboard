package edu.jsu.mcis;

import java.util.*;
import java.io.*;

public class Leaderboard {
	
	public Leaderboard(String type, String id){
		
	}
	
	public String getOutput(String type, String id){
		DataReader reader = new DataReader();
		Student student = new Student();
		String output = "";
        if (type.equals ("Student")) {
			student = reader.getStudent(id);
			output = student.toString();
		}
		
		Course course = new Course();
        if (type.equals ("Course")) {
			course = reader.getCourse(id);
			output = course.toString(); 
		}
		return output;
	}
	
    public static void main(String[] args) {
		Leaderboard lb = new Leaderboard(args[0], args[1]);
		System.out.println(lb.getOutput(args[0], args[1]));
		
		
		
		
		
		
		
	}
	
}