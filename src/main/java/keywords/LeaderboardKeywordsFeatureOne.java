package keywords;

import edu.jsu.mcis.*;
import java.io.*;
import java.util.*;

public class LeaderboardKeywordsFeatureOne {
	private String output;
	private Leaderboard leaderBoard;
	public void startLeaderboardCliWithArguments()throws IOException{
		output = "";
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