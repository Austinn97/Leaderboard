package edu.jsu.mcis;

import java.awt.*;
import javax.swing.*;
import java.util.*;


public class LeaderboardGUI extends JFrame{

	public LeaderboardGUI(){}
    
    public void leaderboardGUI() {
        JFrame frame = new JFrame("Gamegogy");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(350, 350));
        GUIPanels panel = new GUIPanels();
        frame.setLayout(new BorderLayout());
        frame.add(panel);
		frame.setResizable(false);
    }
}