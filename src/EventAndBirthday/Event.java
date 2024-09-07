package EventAndBirthday;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Event {
 public void lk() {}
	public static void main(String[] args) {
	
		LocalDateTime eventDateTime = LocalDateTime.of(2024, 10, 22, 12, 22);
		LocalDateTime todayDateTime = LocalDateTime.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy-MM");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yy-MM-dd");
		DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH");
		String toformatter1 = eventDateTime.format(formatter1);
		String toformatter2 = eventDateTime.format(formatter2);
		String toformatter3 = eventDateTime.format(formatter3);
		String toformatter4 = eventDateTime.format(formatter4);
		String toformatter5 = eventDateTime.format(formatter5);
		System.out.println(toformatter1);
		System.out.println(toformatter2);
		System.out.println(toformatter3);
		System.out.println(toformatter4);
		System.out.println(toformatter5);
		Duration lingthDuration = Duration.between(eventDateTime, todayDateTime);
		System.out.println(lingthDuration);
		long days = lingthDuration.toDays();
		long hours = lingthDuration.toHours()%24;
		long Minutes = lingthDuration.toMinutes()%60;
		System.out.println(
				"Time difference between event and day" + days + " days " + hours + " hours " + Minutes + " Minutes ");
	}
}