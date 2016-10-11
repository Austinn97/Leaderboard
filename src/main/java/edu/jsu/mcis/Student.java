package edu.jsu.mcis;

import java.io.*;
import java.util.*;


public class Student{
	private String id;
	private String firstName;
	private String lastName; 
	private String email; 

    public Student() {
        id = "";
        firstName = "";
        lastName = "";
        email = "";
    }
    
    public Student(String id) {
        this.id = id;
        firstName = "";
        lastName = "";
        email = "";
    }
    
	public String getID(){
		return this.id; 
	}

	public void setID(String id){
		this.id = id; 
	}

	public String getFirstName(){
		return this.firstName; 
	}

	public void setFirstName(String firstName){
		this.firstName = firstName; 
	}

	public String getLastName(){
		return this.lastName; 
	}

	public void setLastName(String lastName){
		this.lastName = lastName; 
	}

	public String getEmail(){
		return this.email; 
	}

	public void setEmail(String email){
		this.email = email; 
	}
    
    @Override
    public String toString() {
        return "[" + getID() + "] " + getFirstName() + " " + getLastName() + " " + getEmail() + "@jsu.edu";
    }
}