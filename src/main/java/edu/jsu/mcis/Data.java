package edu.jsu.mcis;
import java.io.*;
import java.util.*;

public class Data{
	private String line; 
	private String studentFile;


	public String readFile(String string) throws IOException{
		studentFile = "src/test/resources/students.csv";
		File files = new File(string);
		File studentFiles = new File(studentFile);
		Scanner scanner = new Scanner(studentFiles); 
		String lineSeparator = System.getProperty("line.separator");
		try{
			while(scanner.hasNextLine()){
				line = line + scanner.nextLine() + lineSeparator;
				studentFile = line; 
			}
			return line;
		}
		finally{
			scanner.close();
		}
	}

	/*public static StringBuffer dataRead(){
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
	   

        //System.out.println(csvStudentContents);	
		//System.out.println(csvCourseContents);	
	}*/
}