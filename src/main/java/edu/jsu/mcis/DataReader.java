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
            
            try (CSVReader reader = new CSVReader(new FileReader(file))) {
                studentArray = reader.iterator();
                Iterator<Student> studentIterator = studentList.iterator();
                while (studentIterator.hasNext()) {
                    student.setID() = studentIterator.next();
                    student.setFirstName() = studentIterator.next();
                    student.setLastName() = studentIterator.next();
                    student.setEmail() = studentIterator.next();
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