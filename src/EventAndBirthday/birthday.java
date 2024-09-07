package EventAndBirthday;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class birthday {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("inter your date of birthday :");
String userbirthday=scanner.nextLine();
DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd");
LocalDate birthdayDate=LocalDate.parse(userbirthday,formatter);
LocalDate todayDate=LocalDate.now();
Period agePeriod=Period.between(birthdayDate, todayDate);
System.out.println(agePeriod);
	}

}
