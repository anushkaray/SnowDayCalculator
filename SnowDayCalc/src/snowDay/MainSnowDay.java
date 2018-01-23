package snowDay;

import java.io.IOException;

public class MainSnowDay {

	public static void main(String[] args) throws IOException {
		
System.out.println("Getting The five Day Forecast...");
		WeatherApi.Weather(args);
		if (WeatherApi.getFirstDay.contains("Snow")) {
			FirstDaySnow.FirstDay(args);
			
			System.out.println("You have a "+ FirstDaySnow.Percentage + "% chance of a snow day today");
		}
		else {
		
			System.out.println("Sorry no snow day");
		}
		
		
	}

}
