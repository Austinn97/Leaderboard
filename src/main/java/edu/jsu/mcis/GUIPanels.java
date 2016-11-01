package edu.jsu.mcis;

import java.awt.*;
import javax.swing.*;



public class GUIPanels extends JPanel {
    

    public GUIPanels()  {
        BorderLayout borderLayout = new BorderLayout();
        String[] courses = { "Mayonnaise", "Ketchup", "Matt's Beard"};
        String[] columns = { "Zeb's Beard", "Austin's Love", "Jacob's Code"};
        JComboBox<String> courseCb = new JComboBox<String>(courses);
        JComboBox<String> columnCb = new JComboBox<String>(columns);
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        borderLayout.setHgap(100);
        borderLayout.setVgap(100);
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);
        
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