package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.io.*;
import com.opencsv.*;



public class GUIPanels extends JPanel{
   
   public String[] headersArray;
   
   public GUIPanels()  {
		setupBorders();
		}
	
	public void setupBorders(){
		BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);
		
		DataReader reader = new DataReader();
		List<Course> courseList = new ArrayList<Course>();
		Leaderboard lb = new Leaderboard("courseids");
		courseList = reader.getCourseList();
		String[] courseId = new String[courseList.size()];
		courseId = reader.getCourseId(courseList);
        
		JComboBox<String> courseCb = new JComboBox<String>(courseId);
		JComboBox<String> columnCb = new JComboBox<String>();
		
		courseCb.setMaximumRowCount(6);
        columnCb.setMaximumRowCount(6);
        
		JPanel northPanel = new JPanel();
		JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
		JPanel southPanel = new JPanel();
		
		add(northPanel, borderLayout.NORTH);
        add(rightPanel, borderLayout.EAST);
		add(leftPanel, borderLayout.WEST);
		add(southPanel, borderLayout.SOUTH);
		
        JLabel courseLbl = new JLabel("Course");
		JLabel columnLbl = new JLabel("Column");
		JLabel empty = new JLabel("    ");
        northPanel.add(courseLbl);
        northPanel.add(courseCb);
		northPanel.add(empty);
        northPanel.add(columnLbl);
        northPanel.add(columnCb);
		
		courseCb.setVisible(true);
        columnCb.setVisible(true);
		
		JLabel term = new JLabel("Term: ");
		leftPanel.setLayout(new BorderLayout());
		leftPanel.add(term);
		
		
		JLabel enroll = new JLabel("Enrollment: ");
		rightPanel.setLayout(new BorderLayout());
		rightPanel.add(enroll);
		
		
		JLabel id = new JLabel("ID: ");
		JLabel name = new JLabel("Name: ");
        JLabel email = new JLabel("Email: ");
		JLabel score = new JLabel("Score: ");
		southPanel.setLayout(new GridLayout(4, 1));
		southPanel.add(id);
		southPanel.add(name);
		southPanel.add(email);
		southPanel.add(score);
		
		courseCb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//Gets correct term and enrollment
				Course course = new Course();
				DataReader reader = new DataReader();		
				String selectedCourseId = (String) courseCb.getSelectedItem();
				course = reader.getCourse(selectedCourseId);
				term.setText("Term: " + course.getTerm() + " " + course.getYear());
				enroll.setText("Enrollment: " + course.getSize());
				
				//sets correct headers in column combo box
				List<String> headers = new ArrayList<String>();
				try{
				String file;
				file = "src/main/resources/courses/" + selectedCourseId + ".csv";
				CSVReader readerTwo = new CSVReader(new FileReader(file), ',' , '\"');
				String[] nextLine = readerTwo.readNext();
				for(int i=1; i<nextLine.length; i++){
					headers.add(nextLine[i]);
				}
				headersArray = headers.toArray(new String[0]);
				columnCb.setModel(new DefaultComboBoxModel<>(headersArray));
				}
				catch(IOException except){}
			}
		});	
		courseCb.setSelectedItem(courseId[0]);
		
		columnCb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){ 
				List<String> fullHeaders = new ArrayList<String>();
				List<Float> grades = new ArrayList<Float>();
				List<String> ids = new ArrayList<String>();
				
				int assignmentIndex = 0;
				int maxGradeIndex = 0;
				Student student = new Student();
				String maxStuId;
				String selectedCourseId = (String) courseCb.getSelectedItem();
				String selectedAssignment = (String) columnCb.getSelectedItem();
				
				try{
				String file;
				file = "src/main/resources/courses/" + selectedCourseId + ".csv";
				CSVReader readerTwo = new CSVReader(new FileReader(file), ',' , '\"');
				String[] nextLine = readerTwo.readNext();
				for(int i=0; i<nextLine.length; i++){
					fullHeaders.add(nextLine[i]);
				}
				
				assignmentIndex = fullHeaders.indexOf(selectedAssignment);
				
				while ((nextLine = readerTwo.readNext()) != null){
					ids.add(nextLine[0]);
					grades.add(Float.parseFloat(nextLine[assignmentIndex]));
				}
				}
				catch(IOException except){}
				
				//gets top student for selected assignment
				float maxGradeInAssignment = Collections.max(grades);
				maxGradeIndex = grades.indexOf(maxGradeInAssignment);
				maxStuId = ids.get(maxGradeIndex);
				student = reader.getStudent(maxStuId);
				id.setText("ID: " + maxStuId);
				name.setText("Name: " + student.getFirstName() + " " + student.getLastName());
				email.setText("Email: " + student.getEmail() + "@jsu.edu");
				score.setText("Score: " + maxGradeInAssignment);
			}
		});
		columnCb.setSelectedItem(headersArray[0]);
	}    
}