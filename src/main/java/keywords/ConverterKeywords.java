/*package keywords;

import edu.jsu.mcis.*;
import org.json.simple.parser.*;

public class ConverterKeywords {
	
	private Converter convert;
	
	public ConverterKeywords(){
		convert = new Converter();
	}
    
    public String convertToJson(String csv) {
        return convert.csvToJson(csv);
    }
    
    public String convertToCsv(String json) {
        return convert.jsonToCsv(json);
    }
    
    public boolean jsonStringsAreEqual(String s, String t) {        
		JSONParser parser = new JSONParser();
		try {
			Object sObj = parser.parse(s);
			Object tObj = parser.parse(t);
			return sObj.equals(tObj);
		}
		catch(ParseException e) {
			return false;
		}
	}
}*/