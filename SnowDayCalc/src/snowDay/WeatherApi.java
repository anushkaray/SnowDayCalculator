package snowDay;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.json.JSONTokener;



public class WeatherApi {
	static String getFirstDay;
	static String getSecondDay;
	
	
	
	
	
	public static void Weather (String args[]) throws IOException {
		
		
		
		
		
	String baseUrl = "http://query.yahooapis.com/v1/public/yql?q=";
	String query = "select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"nashua, nh\")";
	String fullUrlStr = baseUrl + URLEncoder.encode(query, "UTF-8") + "&format=json";

	URL fullUrl = new URL(fullUrlStr);
	InputStream is = fullUrl.openStream();

	JSONTokener tok = new JSONTokener(is);
	JSONObject result = new JSONObject(tok);
	String result2 =result.toString();
	System.out.println(result2);
	String[] actual = result2.split(Pattern.quote("\\n<BR />"));
	
	String FirstDay = actual[5];
	String SecondDay = actual[6];
	String ThirdDay = actual[7];
	String FourthDay = actual[8];
	String FifthDay = actual[9];

	
//System.out.println(result2);

System.out.println(FirstDay);
System.out.println(SecondDay);
System.out.println(ThirdDay);
System.out.println(FourthDay);
System.out.println(FifthDay);

getFirstDay=FourthDay;
getSecondDay=SecondDay;

	is.close();
}
}