package edu.jsu.mcis;

import java.util.*;
import com.opencsv.*;
import java.io.*;

public class CourseGrades{
	private List<String> headers;
	private List<List<Float>> grades;
	private List<String> ids;
	
	public CourseGrades(String fileName){
		
	}
	public CourseGrades(List<String> headers, List<String> ids, List<List<Float>> grades){
		this.headers = headers;
		this.ids = ids;
		this.grades = grades;
	}
	
	public List<String> getHeaders(){
		return headers;
	}
	
	public List<String> getIds(){
		return ids;
		
	}
	
	public float getGrades(String id, String assignment){
		return grades;
	}
	
	
	
	/*@Override
    public String toString() {
        return "[" + ids + "] " + total + " " + artifactsList + " (" + grade + " students)";
    }*/
	
}
