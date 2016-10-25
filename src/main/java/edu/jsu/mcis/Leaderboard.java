package edu.jsu.mcis;

import java.util.*;
import java.io.*;

public class Leaderboard {
	
	public Leaderboard(String type, String id){
		
	}
	
	public Leaderboard(String type){
		
	}
	/*public String[] getIds(String type){
		DataReader reader = new DataReader();
		String[] studentId = new String[reader.get]
		studentId = reader.getStudentId;
		String
	}*/
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
		DataReader reader = new DataReader();
		if(args[0].equals("Student") || args[0].equals("Course")){
			Leaderboard lb = new Leaderboard(args[0], args[1]);
			System.out.println(lb.getOutput(args[0], args[1]));
		}
		if(args[0].equals("studentids")){
			List<Student> studentList = new ArrayList<Student>();
			studentList = reader.getStudentList();
			Leaderboard lb = new Leaderboard(args[0]);
			String[] studentId = new String[studentList.size()];
			studentId = reader.getStudentId(studentList);
			for(int i = 0; i < studentList.size(); i++){
				System.out.println(studentId[i]);
			}
		}
		if(args[0].equals("courseids")){
			List<Course> courseList = new ArrayList<Course>();
			courseList = reader.getCourseList();
			Leaderboard lb = new Leaderboard(args[0]);
			String[] courseId = new String[courseList.size()];
			courseId = reader.getCourseId(courseList);
			for(int i = 0; i < courseList.size(); i++){
				System.out.println(courseId[i]);
			}
		}
		
		
		
		
		
		
	}
	
}