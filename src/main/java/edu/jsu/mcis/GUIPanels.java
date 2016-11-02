package edu.jsu.mcis;

import java.awt.*;
import javax.swing.*;



public class GUIPanels extends JPanel {
    

    public GUIPanels()  {
        JLabel term = new JLabel("Term");
        BorderLayout borderLayout = new BorderLayout();
        Box box = Box.createVerticalBox();
        setLayout(borderLayout);
        String[] courses = { "111111", "111112", "111113", "111112",
        "111112", "111112", "111112", "111112"};
        String[] columns = { "Assignment 1", "Assignment 2", "Assignment 3",
        "Assignment 2", "Assignment 2", "Assignment 2", "Assignment 2",
        "Assignment 2"};
        JComboBox<String> courseCb = new JComboBox<String>(courses);
        JComboBox<String> columnCb = new JComboBox<String>(columns);
        courseCb.setMaximumRowCount(6);
        columnCb.setMaximumRowCount(6);
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        box.add(leftPanel);
        box.add(term);
        add(box, borderLayout.WEST);
        add(rightPanel, borderLayout.EAST);
        JLabel courseLbl = new JLabel("Course");
        leftPanel.add(courseLbl);
        leftPanel.add(courseCb);
        JLabel columnLbl = new JLabel("Column");
        rightPanel.add(columnLbl);
        rightPanel.add(columnCb);
        courseCb.setVisible(true);
        columnCb.setVisible(true);
    }
}