package keywords;

import edu.jsu.mcis.*;
import java.io.*;
import java.util.*;

public class LeaderboardKeywords {
	private String output;
	private Leaderboard leaderBoard;
		
	public void startLeaderboardCliWithArguments()throws IOException{
		output = "";
	}
	public void startLeaderboardCliWithArguments(String type)throws IOException{
		leaderBoard = new Leaderboard(type);
		DataReader reader = new DataReader();
		List<Student> studentList = new ArrayList<Student>(); 
		List<Course> courseList = new ArrayList<Course>();
		
		studentList = reader.getStudentList();
		courseList = reader.getCourseList();
		String[] idArray = new String[studentList.size()];
		
		
		
		if(type.equals("studentids")){
			output = reader.getStudentId(studentList).toString();
		}
		if(type.equals("courseids")){
			output = reader.getCourseId(courseList).toString();
		}
	}
	
	public void startLeaderboardCliWithArguments(String type, String id)throws IOException{
		leaderBoard = new Leaderboard(type,id);
		DataReader datareader = new DataReader();
		
		if(type.equals("student")){
			output = datareader.getStudent(id).toString();
			
		}
		if(type.equals("course")){
			output = datareader.getCourse(id).toString();
			
		}
	}
	public String getCommandLineOutput(){
		return output;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}