package edu.jsu.mcis;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        ClassLoader csvStudentLoader = ClassLoader.getSystemClassLoader();
        StringBuffer csvStudentContents = new StringBuffer();
		ClassLoader csvCourseLoader = ClassLoader.getSystemClassLoader();
		StringBuffer csvCourseContents = new StringBuffer();
		
        try(BufferedReader csvStudentReader = new BufferedReader(new InputStreamReader(csvStudentLoader.getResourceAsStream("students.csv")))) {
            String studentLine;
            while((studentLine = csvStudentReader.readLine()) != null) {
                csvStudentContents.append(studentLine + '\n');
            }
        }
       catch(IOException e){}
	   try(BufferedReader csvCourseReader = new BufferedReader(new InputStreamReader(csvCourseLoader.getResourceAsStream("courses.csv")))){
		   String courseLine;
		   while((courseLine = csvCourseReader.readLine()) != null){
			   csvCourseContents.append(courseLine + '\n');
		   }
	   
	   
	   }
		catch(IOException e){}
	   
        System.out.println(csvStudentContents);	
		System.out.println(csvCourseContents);	
	}
	
}