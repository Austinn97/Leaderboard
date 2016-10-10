package edu.jsu.mcis;

import java.util.*;
import com.opencsv.CSVReader;
import java.io.*;


public class DataReader{
    List<Student> studentList = new ArrayList<Student>();
    List<Course> courseList = new ArrayList<Course>();

    public List readFile(String fileType) throws IOException {
        String file;

        if (fileType == "Student") {
            file = "src/main/resources/students.csv";
            Student student = new Student();
            
            try (CSVReader reader = new CSVReader(new FileReader(file))) {
                //List<String[]> rows = reader.readAll();
                for (i = 0; i < rows.size(); i++) {
                    
                }
                /*Iterator stuIterator = studentList.iterator();
                while (stuIterator.hasNext()) {
                    student.setID = stuIterator.next();
                    student.setFirstName = stuIterator.next();
                    student.setLastName = stuIterator.next();
                    student.setEmail = stuIterator.next();
                }*/
                return studentList;
            }
        }
        else if (fileType == "Course") {
            file = "src/main/resources/courses.csv";
            try (CSVReader reader = new CSVReader(new FileReader(file))) {
                courseList = reader.readAll();
                Iterator courseIterator = courseList.iterator();
                while (courseIterator.hasNext()) {
                    course.setID = courseIterator.next();
                    course.setTerm = courseIterator.next();
                    course.setYear = courseIterator.next();
                    course.setSize = courseIterator.next();
                }
                return courseList;
            }
        }
    }
}