package snowDay;
import java.util.Scanner;
import java.util.regex.Pattern;
public class FirstDaySnow {
	
static float Percentage;
	public static void FirstDay (String[] args) {
		int tally=9;
		
		
		String[] Temp = WeatherApi.getFirstDay.split("Low: ");
		
		String lowTemp = Temp[1];
		int numberLowTemp = Integer.parseInt(lowTemp);
		if (numberLowTemp <32) {
			tally= tally+4;
		}
		else {
			System.out.println("more test stuff");
		}
		Scanner inches= new Scanner(System.in);
		System.out.println("How many inches of snow are expected by 7 am today?");
		int userAnswer = inches.nextInt();
		if (userAnswer>=4) {
			tally=tally+4;
		}
		else {
			System.out.println("Teststuff");
		}
		System.out.println("how many snow days have already been called?");
		String SnowOutday= inches.nextLine();
				//if ()
		
		System.out.println(tally);
		
		
		
		Percentage = (float) ((tally*100)/35);
		System.out.println(Percentage);
		
		
		
		
		
		
		
	}
	

}
