package edu.jsu.mcis;

import java.util.*;
import com.opencsv.*;
import java.io.*;

public class CourseGrades{
	private String[] assignment;
	private String[] exam;
	private String total;
	private String id;
	private String grades;
	public CourseGrades(String fileName){
		
	}
	public CourseGrades(String [] assignment, String[] exam, String id, String grades, String total){
		this.assignment = assignment;
		this.exam = exam;
		this.id = id;
		this.grades = grades;
		this.total = total;
	}
	
}
