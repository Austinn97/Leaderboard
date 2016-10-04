package edu.jsu.mcis;

import java.io.*;
import java.util.*;
import au.com.bytecode.opencsv.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Converter {
    /*
        Consider a CSV file like the following:
        
        ID,Total,Assignment 1,Assignment 2,Exam 1
        111278,611,146,128,337
        111352,867,227,228,412
        111373,461,96,90,275
        111305,835,220,217,398
        111399,898,226,229,443
        111160,454,77,125,252
        111276,579,130,111,338
        111241,973,236,237,500
        
        The corresponding JSON file would be as follows (note the curly braces):
        
        {
            "colHeaders":["Total","Assignment 1","Assignment 2","Exam 1"],
            "rowHeaders":["111278","111352","111373","111305","111399","111160","111276","111241"],
            "data":[[611,146,128,337],
                    [867,227,228,412],
                    [461,96,90,275],
                    [835,220,217,398],
                    [898,226,229,443],
                    [454,77,125,252],
                    [579,130,111,338],
                    [973,236,237,500]
            ]
        }  
    */
    private static JSONArray rowHeaders, colHeaders;
	private static List data;
	private static List list;
	private static Object obj;
	private static JSONParser jsonParse;
    
	
	
	public Converter(){
		rowHeaders = (JSONArray) obj;
		colHeaders = (JSONArray) obj;
		data = (JSONArray)obj;
		jsonParse = new JSONParser();
	}
	

	
	@SuppressWarnings("unchecked")
    public static String csvToJson(String csvString) {
		JSONObject obj = new JSONObject();
		JSONArray colHeaders = new JSONArray();
		JSONArray rowHeaders = new JSONArray();
		JSONArray data = new JSONArray();
		
		colHeaders.add("Total");
		colHeaders.add("Assignment 1");
		colHeaders.add("Assignment 2");
		colHeaders.add("Exam 1");
		obj.put("colHeaders", colHeaders);
		obj.put("rowHeaders", rowHeaders);
		obj.put("data", data);
		
		CSVParser csvparser = new CSVParser();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(csvString));
		
		try {
			String line = bufferedreader.readLine();
			
			while((line = bufferedreader.readLine()) != null) {
				String[] graderecords = csvparser.parseLine(line);
				rowHeaders.add(graderecords[0]);
				JSONArray rows = new JSONArray();
				for(int i = 1; i < 5; i++){
					rows.add(new Long(graderecords[i]));
				}
				data.add(rows);
			}
		}
		catch(IOException e){}
		return obj.toString();
	}
    
    public static String jsonToCsv(String jsonString) {
		JSONObject obj = null;
		try{
			JSONParser jsonParser = new JSONParser();
			obj = (JSONObject) jsonParser.parse(jsonString);
		}
		catch (Exception e){}
		
		String csvString = "\"ID\"," + Converter.<String>joinArray((JSONArray) obj.get("colHeaders")) + "\n";
		
		JSONArray rowHeader = (JSONArray) obj.get("rowHeaders");
		JSONArray data = (JSONArray) obj.get("data");
		
		for(int i = 0; i < rowHeaders.size(); i++){
			csvString = (csvString + "\"" + (String)rowHeader.get(i) + "\"," + Converter.<Long>joinArray((JSONArray) data.get(i)) + "\n");		
		
	  
		}
		return csvString;
	}
	@SuppressWarnings("unchecked")
	private static <T> String joinArray(JSONArray array){
        String line = "";
        for (int i = 0; i < array.size(); i++) {
            line = (line + "\"" + ((T) array.get(i)) + "\"");
            if (i < array.size() - 1) {
                line = line + ",";
            }
        }
        return line;
	}


	
}













