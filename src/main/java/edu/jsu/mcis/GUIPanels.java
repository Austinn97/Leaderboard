package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.io.*;
import com.opencsv.*;
@SuppressWarnings("unchecked")


public class GUIPanels  extends JPanel{
	JLabel studentId,studentEmail,studentScore,studentName,courseTerm,courseEnrollment,columnLbl,empty,courseLbl;
	JComboBox<String> courseComboBox,columnComboBox;
	DataReader reader;
	Course course;
	
	
   
   public String[] headersArray;
   
   public GUIPanels()  {
		setupBorders();
		}
	
	public void setupBorders(){
		BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);
		
		reader = new DataReader();
		List<Course> courseList = new ArrayList<Course>();
		Leaderboard lb = new Leaderboard("courseIds");
		courseList = reader.getCourseList();
		String[] courseId = new String[courseList.size()];
		courseId = reader.getCourseId(courseList);
		
        
		courseComboBox = new JComboBox<String>(courseId);
		courseComboBox.setName("courseComboBox");
		courseComboBox.setSelectedItem(0);
		columnComboBox = new JComboBox<String>();
		columnComboBox.setName("columnComboBox");
		
		CourseGrades courseCg = new CourseGrades("99000");
		String[] headersArray = courseCg.getHeaders();
		columnComboBox.setModel(new DefaultComboBoxModel<>(headersArray));
		columnComboBox.setSelectedItem(0);
		
		courseComboBox.setMaximumRowCount(6);
        columnComboBox.setMaximumRowCount(6);
        
		JPanel northPanel = new JPanel();
		JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
		JPanel southPanel = new JPanel();
		
		add(northPanel, borderLayout.NORTH);
        add(rightPanel, borderLayout.EAST);
		add(leftPanel, borderLayout.WEST);
		add(southPanel, borderLayout.SOUTH);
		
        courseLbl = new JLabel("Course");
		columnLbl = new JLabel("Column");
		empty = new JLabel("    ");
        northPanel.add(courseLbl);
        northPanel.add(courseComboBox);
		northPanel.add(empty);
        northPanel.add(columnLbl);
        northPanel.add(columnComboBox);
		
		courseComboBox.setVisible(true);
        columnComboBox.setVisible(true);
		
		courseTerm = new JLabel("Term: ");
		courseTerm.setName("courseTerm");
		leftPanel.setLayout(new BorderLayout());
		leftPanel.add(courseTerm);
		
		
		courseEnrollment = new JLabel("Enrollment: ");
		courseEnrollment.setName("courseEnrollment");
		rightPanel.setLayout(new BorderLayout());
		rightPanel.add(courseEnrollment);
		
		
		studentId = new JLabel("Id: ");
		studentId.setName("studentId");
		studentName = new JLabel("Name: ");
		studentName.setName("studentName");
        studentEmail = new JLabel("Email: ");
		studentEmail.setName("studentEmail");
		studentScore = new JLabel("Score: ");
		studentScore.setName("studentScore");
		southPanel.setLayout(new GridLayout(4, 1));
		southPanel.add(studentId);
		southPanel.add(studentName);
		southPanel.add(studentEmail);
		southPanel.add(studentScore);
		updateHigherLabels();
		updateLowerLabels();
		courseComboBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				updateHigherLabels();
			}
		});	
		
		columnComboBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){ 			
				updateLowerLabels();
			}
		});
		
		}  
	private void updateHigherLabels(){
				
				reader = new DataReader();		
				String selectedCourseId = (String) courseComboBox.getSelectedItem();
				course = reader.getCourse(selectedCourseId);
				courseTerm.setText("Term: " + course.getTerm() + " " + course.getYear());
				courseEnrollment.setText("Enrollment: " + course.getSize());
				CourseGrades courseCg = new CourseGrades(selectedCourseId);
				String[] headersArray = courseCg.getHeaders();
				columnComboBox.setModel(new DefaultComboBoxModel<>(headersArray));
				columnComboBox.setSelectedItem(0);
	}
	private void updateLowerLabels(){
		String selectedCoursestudentId = (String) courseComboBox.getSelectedItem();
			String selectedAssignment = (String) columnComboBox.getSelectedItem();
			
			CourseGrades columnCg = new CourseGrades(selectedCoursestudentId, selectedAssignment);
	
			Student student = new Student();
			float maxGradeInAssignment = Collections.max(columnCg.getGrades());
			int maxGradeIndex = columnCg.getGrades().indexOf(maxGradeInAssignment);
			String maxStuId = columnCg.getIds().get(maxGradeIndex);
			student = reader.getStudent(maxStuId);
			studentId.setText("Id: " + maxStuId);
			studentName.setText("Name: " + student.getFirstName() + " " + student.getLastName());
			studentEmail.setText("Email: " + student.getEmail() + "@jsu.edu");
			studentScore.setText("Score: " + maxGradeInAssignment);
		}
		
	}
	
