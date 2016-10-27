package edu.jsu.mcis;

import java.util.*;
import java.io.*;

public class Leaderboard {
	
	public Leaderboard(String type, String id){}	
	public Leaderboard(String type){}
	
	public String getOutput(String type, String id){
		DataReader reader = new DataReader();
		Student student = new Student();
		String output = "";
		String stud = "student";
        if (type.equalsIgnoreCase(stud)){
			student = reader.getStudent(id);
			output = student.toString();
		}		
		Course course = new Course();
		String cour = "course";
        if (type.equalsIgnoreCase(cour)){
			course = reader.getCourse(id);
			output = course.toString(); 
		}
		return output;
	}
	
    public static void main(String[] args) {
		DataReader reader = new DataReader();

		if(args[0].equalsIgnoreCase("student") || args[0].equalsIgnoreCase("course")){
			Leaderboard lb = new Leaderboard(args[0], args[1]);
			System.out.println(lb.getOutput(args[0], args[1]));
		}
		if(args[0].equalsIgnoreCase("studentids")){
			List<Student> studentList = new ArrayList<Student>();
			studentList = reader.getStudentList();
			Leaderboard lb = new Leaderboard(args[0]);
			String[] studentId = new String[studentList.size()];
			studentId = reader.getStudentId(studentList);
			for(int i = 0; i < studentList.size(); i++){
				System.out.println(studentId[i]);
			}
		}
		if(args[0].equalsIgnoreCase("courseids")){
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