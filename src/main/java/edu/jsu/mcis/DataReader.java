package edu.jsu.mcis;
import java.util.*;
import com.opencsv.*;
import java.io.*;


public class DataReader{
    private List<Student> studentList = new ArrayList<Student>(); 
    private List<Course> courseList = new ArrayList<Course>();

    public DataReader() throws IOException{        
        readFile("Student");
        readFile("Course");
    }

    public void readFile(String fileType) throws IOException{       

        if (fileType.equals("Student")) {
            String file;
            file = "src/main/resources/students.csv";
            
            CSVReader reader = new CSVReader(new FileReader(file), ',' , '\'', 1);
            Iterator<String[]> studentArray;
            CSVIterator iterator = new CSVIterator(reader);
            studentArray = iterator;    
            while (iterator.hasNext()) {
                String[] temp = studentArray.next();
                Student student = new Student();
                student.setID(temp[0]);
                student.setFirstName(temp[1]);
                student.setLastName(temp[2]);
                student.setEmail(temp[3]);
                studentList.add(student); 
            }
        }
        else if (fileType.equals("Course")) {
            String file;
            file = "src/main/resources/courses.csv";
            CSVReader reader = new CSVReader(new FileReader(file), ',' , '\'', 1);  
            Iterator<String[]> courseArray;
            CSVIterator iterator = new CSVIterator(reader);
            courseArray = iterator; 
            while (iterator.hasNext()){
                String[] temp = courseArray.next();
                Course course = new Course();
                course.setID(temp[0]);
                course.setTerm(temp[1]);
                course.setYear(temp[2]);
                course.setSize(temp[3]);
                courseList.add(course);
            }
        }
    }
    public List<Student> getStudentList(){
        return studentList;
    }
    public List<Course> getCourseList(){
        return courseList;
    }
}