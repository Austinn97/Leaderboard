package edu.jsu.mcis;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;


public class GUIPanels extends JPanel {
    

    public GUIPanels()  {
        BorderLayout borderLayout = new BorderLayout();
        setLayout(borderLayout);
        
		DataReader reader = new DataReader();
		List<Course> courseList = new ArrayList<Course>();
		courseList = reader.getCourseList();
		Leaderboard lb = new Leaderboard("courseids");
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
		
		JLabel term = new JLabel("            Term: ");
		leftPanel.setLayout(new BorderLayout());
		leftPanel.add(term);
		
		
		JLabel enroll = new JLabel("Enrollment:                                ");
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
    }
}