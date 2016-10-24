package edu.jsu.mcis;

import java.util.*;
import java.io.*;

public class Leaderboard {
	
    public static void main(String[] args) {
		DataReader reader = new DataReader();
		Student student = new Student();
        if (args[0].equals ("Student")) {
			student = reader.getStudent(args[1]);
			System.out.println(student);
		}
		
	}
	
}