package EventAndBirthday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class birthday {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("inter your date of birthday :");
		String userbirthday = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate birthdayDate = LocalDate.parse(userbirthday, formatter);
		LocalDate todayDate = LocalDate.now();
		Period agePeriod = Period.between(birthdayDate, todayDate);
		System.out.println(agePeriod);
		int years=agePeriod.getYears();
		int month =agePeriod.getMonths();
		int day=agePeriod.getDays();
		DayOfWeek Thedayborn=birthdayDate.getDayOfWeek();
		System.out.println("you were born on a "+Thedayborn);
		System.out.println("you are "+years+" years and "+month+" month and "+day+"days");
		
	}

}
