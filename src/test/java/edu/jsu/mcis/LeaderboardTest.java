edu.jsu.mcis; 

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*; 

public class LeaderboardTest{
	private String csvStudentString;
	private String csvCourseString; 
	private Gamegogy yes; 

	private static String readFile(String string) throws IOException{
		File files = new File(string);
		Scanner scanner = new Scanner(files); 
		String lineSeparator = System.getProperty("line.separator");
		try{
			while(scanner.hasNextLine()){
				line = line + scanner.nextLine() + lineSeparator; 
			}
			return line;
		}
		finally{
			scanner.close();
		}
	}

	@Before
	public void setUp(){
		try{
			csvStudentString = readFile("src/test/resources/students.csv");
			csvCourseString =  readFile("src/test/resources/courses.csv");
		}
		catch(IOException e){}
	}

	@Test
	public void testReadsInStudentFile{
		assertEquals(false); 
	}

	@Test
	public void testReadsInCourseFile{
		assertEquals(false); 
	}
}