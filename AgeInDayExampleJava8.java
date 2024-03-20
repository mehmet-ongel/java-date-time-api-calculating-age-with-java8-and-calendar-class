package testforother;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeInDayExampleJava8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your year of birth:");
		int year = scanner.nextInt();
		System.out.println("Please enter your month of birth:");
		int month = scanner.nextInt();
		System.out.println("Please enter your birthday:");
		int day = scanner.nextInt();
		
		LocalDateTime localDateTime2 = LocalDateTime.of(year, month, day, 00, 00, 00);
		
		System.out.println("birthday as string: " + localDateTime2);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("formatted date: " + formatter.format(localDateTime2));
		
		long birthdayAsMilliseconds = localDateTime2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
		System.out.println("birthday as milliseconds: " + birthdayAsMilliseconds);
		
		long nowAsMilliseconds = ZonedDateTime.now().toInstant().toEpochMilli();
		System.out.println("now as milliseconds: " + nowAsMilliseconds);
		
		long difference = nowAsMilliseconds - birthdayAsMilliseconds;
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
