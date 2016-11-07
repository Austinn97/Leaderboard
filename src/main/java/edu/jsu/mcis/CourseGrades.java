package edu.jsu.mcis;

import java.util.*;
import com.opencsv.*;
import java.io.*;

public class CourseGrades{
	private List<String> artifcatsList;
	private String total;
	private String id;
	private String grades;
	
	public CourseGrades(String fileName){
		
	}
	public CourseGrades(List<String> artifcatsList, String id, String grades, String total){
		this.artifcatsList = artifcatsList;
		this.id = id;
		this.grades = grades;
		this.total = total;
	}
	
	public CourseGrades(){
		artifcatsList = new ArrayList<String>();
		id = "";
		grades = "";
		total= "";
		
	}
	public List<String> getArtifact(){
		return artifcatsList;
	}
	public void setArtifcat(List<String> artifcatsList){
		this.artifcatsList = artifcatsList;
	}
	
	public String getID(){
		return id;
	}
	
	public void setID(String id){
		this.id = id;
	}
	
	public String getGrades(){
		return grades;
	}
	
	public void setGrades(String grades){
		this.grades = grades;
	}
	
	public String getTotal(){
		return total;
	}
	
	public void setTotal(String total){
		this.total = total;
	}
	
	
	
}
