package edu.jsu.mcis;

import java.awt.*;
import javax.swing.*;
import java.util.*;


public class LeaderboardGUI  extends JFrame{ 
	public LeaderboardGUI(){}
    
    public void leaderboardGUI() {
        JFrame frame = new JFrame("Leaderboard");        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        GUIPanels panel = new GUIPanels();
        BarGraph barGraph = new BarGraph(panel);
        panel.setBarGraph(barGraph);
        JScrollPane scroll = new JScrollPane(barGraph);
        scroll.setPreferredSize(new Dimension(300, 300));
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.SOUTH);
        frame.add(scroll, BorderLayout.NORTH);
        frame.setVisible(true);
		frame.setResizable(true);
    }
}