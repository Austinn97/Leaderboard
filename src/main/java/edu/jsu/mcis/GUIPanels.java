package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.*;
import java.util.List;


public class GUIPanels extends JPanel{
    DataReader reader = new DataReader();
	Course course = new Course();
	List<Course> courseList = new ArrayList<Course>();
	Leaderboard lb = new Leaderboard("courseids");
	BorderLayout borderLayout = new BorderLayout();
	

    public GUIPanels()  {
        
        setLayout(borderLayout);
		setupBorders();
		}
	
	public void setupBorders(){
		courseList = reader.getCourseList();
		String[] courseId = new String[courseList.size()];
		courseId = reader.getCourseId(courseList);
        
		String[] columns = { "Assignment 1", "Assignment 2", "Assignment 3",
        "Assignment 2", "Assignment 2", "Assignment 2", "Assignment 2",
        "Assignment 2"};
        
		JComboBox<String> courseCb = new JComboBox<String>(courseId);
		JComboBox<String> columnCb = new JComboBox<String>(columns);
		
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
		
		JLabel termColon = new JLabel("Term: ");
		leftPanel.setLayout(new BorderLayout());
		leftPanel.add(termColon);
		
		
		JLabel enroll = new JLabel("Enrollment: ");
		rightPanel.setLayout(new BorderLayout());
		rightPanel.add(enroll);
		
		JLabel id = new JLabel("ID: ");
		JLabel name = new JLabel("Name: ");
        JLabel email = new JLabel("Email: ");
		JLabel score = new JLabel("Score: ");
		southPanel.add(id);
		southPanel.add(name);
		southPanel.add(email);
		southPanel.add(score);
		
		courseCb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				DataReader reader = new DataReader();		
				String id = (String) courseCb.getSelectedItem();
				course = reader.getCourse(id);
				termColon.setText("Term: " + course.getTerm() + " " + course.getYear());
				enroll.setText("Enrollment: " + course.getSize());
				
			}
		});	
		courseCb.setSelectedItem(courseId[0]);
		columnCb.setSelectedItem(columns[0]);
	}    
}