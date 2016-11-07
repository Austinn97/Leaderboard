package edu.jsu.mcis;
import java.util.*;
import com.opencsv.*;
import java.io.*;


public class DataReader{
    private List<Student> studentList = new ArrayList<Student>(); 
    private List<Course> courseList = new ArrayList<Course>();

    public DataReader() {
		try {
			readFile("Student");
			readFile("Course");
			readFile("Grades");
			
			}
		catch(IOException e) {e.printStackTrace();}
    }

    private void readFile(String fileType) throws IOException{       

        if (fileType.equals("Student")) {
            String file;
            file = "src/main/resources/students.csv";
            
            CSVReader reader = new CSVReader(new FileReader(file), ',' , '\"', 1);
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
            CSVReader reader = new CSVReader(new FileReader(file), ',' , '\"', 1);  
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
		/*else if(fileType.equals("Grades")){
			String file;
			String inputForFile;
			System.out.println("What course are you wanting to look at?");
			inputForFile = System.console().readLine();
			file = "src/main/resources/" + inputForFile + ".csv";
			CSVReader reader = new CSVReader(new FileReader(file), ',' , '\"');
			
		}*/
    }
    public List<Student> getStudentList(){
        return studentList;
    }
	
    public List<Course> getCourseList(){
        return courseList;
    }
	
	public Student getStudent(String id) {
		Student tempstudent = new Student();
		for(int i = 0; i < studentList.size(); i++){
			if(studentList.get(i).getID().equals(id)){
				tempstudent = studentList.get(i);
			}
		}
		return tempstudent;
	}
	public Course getCourse(String id) {
		Course tempcourse = new Course();
		for(int i = 0; i < courseList.size(); i++){
			if(courseList.get(i).getID().equals(id)){
				tempcourse = courseList.get(i);
			}
		}
		return tempcourse;
	}
	public String[] getStudentId(List<Student> studentList){
		String[] studentId = new String[studentList.size()];
		for(int i = 0; i < studentList.size(); i++){
			studentId[i] = studentList.get(i).getID();
			
			
		}
		return studentId;
		}
	public String[] getCourseId(List<Course> courseList){
		String[] courseId = new String[courseList.size()];
		for(int i = 0; i < courseList.size(); i++){
			courseId[i] = courseList.get(i).getID();
			
			
		}
		return courseId;
		}
}