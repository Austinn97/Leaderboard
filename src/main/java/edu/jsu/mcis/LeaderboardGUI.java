package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class LeaderboardGUI extends JFrame implements ActionListener{

	private LeaderboardGUI(){
		setLayout(new GridLayout(3,3));
	}

	@Override
	private void actionPerformed(ActionEvent()){}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
        LeaderboardGUI win = new LeaderboardGUI();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.pack();
        frame.add(win);
        win.setSize(400, 400);
        win.setVisible(true);

    }
}