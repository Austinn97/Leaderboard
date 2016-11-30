package edu.jsu.mcis;

import java.util.*;
import java.util.List;
import com.opencsv.*;
import java.io.*;

public class CourseGrades{
	private List<String> headers = new ArrayList<String>(); 
	private List<String> ids = new ArrayList<String>();
	private List<Float> grades = new ArrayList<Float>();
	
	
	public CourseGrades(String selectedCourseId){
		try{
			String file;
			file = "src/main/resources/courses/" + selectedCourseId + ".csv";
			CSVReader reader = new CSVReader(new FileReader(file), ',' , '\"');
			String[] nextLine = reader.readNext();
			for(int i=1; i<nextLine.length; i++){
				headers.add(nextLine[i]);
			}
		}
		catch(IOException except){}
	}
	
	public CourseGrades(String selectedCourseId, String selectedAssignment){
		try{
			List<String> fullHeaders = new ArrayList<String>();
			int assignmentIndex;
			String file;
			file = "src/main/resources/courses/" + selectedCourseId + ".csv";
			CSVReader reader = new CSVReader(new FileReader(file), ',' , '\"');
			String[] nextLine = reader.readNext();
            
			for(int i=0; i<nextLine.length; i++){
				fullHeaders.add(nextLine[i]);
			}
			assignmentIndex = fullHeaders.indexOf(selectedAssignment);
				
			while ((nextLine = reader.readNext()) != null){
					ids.add(nextLine[0]);
					grades.add(Float.parseFloat(nextLine[assignmentIndex]));
			}
		}
		catch(IOException except){}
	}

	
	public String[] getHeaders(){
		String [] headersArray = headers.toArray(new String[0]);
		return headersArray;
	}
	
	public List<Float> getGrades(){
		return grades;
	}
	
	public List<String> getIds(){
		return ids;
	}

}