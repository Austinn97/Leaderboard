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
		StringBuilder builder = new StringBuilder();
		leaderBoard = new Leaderboard(type);
		DataReader reader = new DataReader();
		
		if(type.equals("studentids")){
			String[] studentOutput;
			List<Student> studentList = new ArrayList<Student>(); 
			studentList = reader.getStudentList();
			studentOutput = new String[studentList.size()];
			studentOutput = reader.getStudentId(studentList);
			
			for(String output : studentOutput){
				if(builder.length()> 0){
					
					builder.append("\n");
					
				}
				
				builder.append(output);
			}
			
			output = builder.toString();
			
		}
		if(type.equals("courseids")){
			String[] courseOutput;
			List<Course> courseList = new ArrayList<Course>();
			courseList = reader.getCourseList();
			courseOutput = new String[courseList.size()];
			courseOutput = reader.getCourseId(courseList);
			
			for(String output : courseOutput){
				if(builder.length() > 0){
					builder.append("\n");
				}
				builder.append(output);
			}
			output = builder.toString();
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