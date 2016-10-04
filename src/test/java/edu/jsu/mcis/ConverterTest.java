package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConverterTest {
    private String csvString;
    private String jsonString;
	private Converter convert;
	private String csvStr;
	private String jsonStr;
	private static String line;
	
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
    public void setUp() {
		convert = new Converter();
		try{
			csvStr = readFile("src/test/resorces/grades.csv");
			jsonStr = readFile("src/test/resources/grades.json");
		}
		catch(IOException e){}
		
    }
    
    @Test
    public void testConvertCSVtoJSON() {
        // You should test using the files in src/test/resources.
        assertTrue(true);
    }

    @Test
    public void testConvertJSONtoCSV() {
        // You should test using the files in src/test/resources.
        assertTrue(true);
    }
}







