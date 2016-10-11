package edu.jsu.mcis;


public class Course{
	private String id;
	private String term;
	private String year; 
	private String classSize; 

	public String getID(){
		return this.id; 
	}

	public void setID(String id){
		this.id = id; 
	}

	public String getTerm(){
		return this.term; 
	}

	public void setTerm(String term){
		this.term = term; 
	}

	public String getYear(){
		return this.year; 
	}

	public void setYear(String year){
		this.year = year; 
	}

	public String getSize(){
		return this.classSize; 
	}

	public void setSize(String classSize){
		this.classSize = classSize; 
	}
    
    @Override
    public String toString() {
        return "[" + getID() + "] " + getTerm() + " " + getYear() + " (" + getSize() + ") students";
    }
}