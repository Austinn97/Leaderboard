package edu.jsu.mcis;

import java.util.*;
import com.opencsv.CSVReader;
import java.io.*;


public class DataReader{
    private int i, j, x, y = 0;
    private List<Student> studentList = new ArrayList<Student>(); 
    private List<Course> courseList = new ArrayList<Course>();
    private Iterator<String[]> studentArray;
    private Student student;
    private Course course;
    private DataReader reader; 

    public List readFile(String fileType){ //might need IO exception
        String file;

        if (fileType == "Student") {
            file = "src/main/resources/students.csv";
            
            try (CSVReader reader = new CSVReader(new FileReader(file))){
                CSVIterator iterator = new CSVIterator(reader);
                studentArray = iterator;
                
                Iterator<Student> studentIterator = studentList.iterator();
                while (studentIterator.hasNext()) {
                    student.setID(studentArray.next());
                    student.setFirstName(studentArray.next());
                    student.setLastName(studentArray.next());
                    student.setEmail(studentArray.next());
                    System.out.println("");
                }
                return studentList;
            }
        }
        else if (fileType == "Course") {
            file = "src/main/resources/courses.csv";
            try (CSVReader reader = new CSVReader(new FileReader(file))) {
                courseList = reader.readAll();
                Iterator<Course> courseIterator = courseList.iterator();
                while (courseIterator.hasNext()) {
                    course.setID() = courseIterator.next();
                    course.setTerm() = courseIterator.next();
                    course.setYear() = courseIterator.next();
                    course.setSize() = courseIterator.next();
                }
                return courseList;
            }
        }
        return null; 
    }
}