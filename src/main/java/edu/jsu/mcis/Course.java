package edu.jsu.mcis;


public class Course{
	private String id;
	private String term;
	private String year; 
	private String classSize; 
	
	public Course (String id, String term, String year, String classSize) {
		this.id = id;
		this.term = term;
		this.year = year;
		this.classSize = classSize;
	}
	
	public Course (){
		id = "";
		term = "";
		year = "";
		classSize = "";
	}

	public String getID(){
		return id; 
	}

	public void setID(String id){
		this.id = id; 
	}

	public String getTerm(){
		return term; 
	}

	public void setTerm(String term){
		this.term = term; 
	}

	public String getYear(){
		return year; 
	}

	public void setYear(String year){
		this.year = year; 
	}

	public String getSize(){
		return classSize; 
	}

	public void setSize(String classSize){
		this.classSize = classSize; 
	}
    
    @Override
    public String toString() {
        return "[" + id + "] " + term + " " + year + " (" + classSize + " students)";
    }
}