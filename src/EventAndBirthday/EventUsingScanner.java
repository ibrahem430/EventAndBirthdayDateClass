package EventAndBirthday;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EventUsingScanner {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("inter the date of Event :");
		String eventdatetim=scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH");
		LocalDateTime evDateTime=LocalDateTime.parse(eventdatetim,formatter);
		LocalDateTime todayDateTime=LocalDateTime.now();
		Duration duration=Duration.between(evDateTime, todayDateTime);
		System.out.println(duration);
		long days=duration.toDays();
		long hours=duration.toHours()%24;
		long Minutes=duration.toMinutes()%60;
		System.out.println(
				"Time difference between event and day" + days + " days " + hours + " hours " + Minutes + " Minutes ");
	}

}
