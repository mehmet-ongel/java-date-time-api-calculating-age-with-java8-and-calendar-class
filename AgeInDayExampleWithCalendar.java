package testforother;

import java.util.Calendar;
import java.util.Scanner;

public class AgeInDayExampleWithCalendar {

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter your year of birth:");
			int yearOfBirth = scanner.nextInt();
			System.out.println("Please enter your month of birth:");
			int monthOfBirth = scanner.nextInt();
			System.out.println("Please enter your birthday:");
			int dayOfBirth = scanner.nextInt();
			
			Calendar calendar = Calendar.getInstance();
			calendar.set(yearOfBirth, monthOfBirth - 1, dayOfBirth);
			
			long birthdayInMillis = calendar.getTimeInMillis();
			System.out.println("Birthday in millis: " + birthdayInMillis);
			
			Calendar calendar2 = Calendar.getInstance();
			long currentTimeInMillis = calendar2.getTimeInMillis();
			System.out.println("Current time in millis: " + currentTimeInMillis);
			
			long difference = currentTimeInMillis - birthdayInMillis;
			System.out.println("Difference in millis: " + difference);
			
			long ageAsSecond = difference / 1000;
			long ageAsMinute = ageAsSecond / 60;
			long ageAsHour = ageAsMinute / 60;
			long ageAsDay = ageAsHour / 24;
			long ageAsYear = difference / 1000 / 60 / 60 / 24 / 365;
			System.out.println("Your age: " + ageAsYear);
			System.out.println("Your age as day: " + ageAsDay);
			System.out.println("Your age as hour: " + ageAsHour);
			System.out.println("Your age as minute: " + ageAsMinute);
			
			scanner.close();
		
	}

}
