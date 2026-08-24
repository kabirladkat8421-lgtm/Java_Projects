package work;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
		System.out.print("Enter Which days of the week is: ");
		String day = sc.next();
		switch (day) {
		case ("Monday") -> System.out
				.println("It's Monday Date: " + date.format(dateFormatter) + ", Time: " + time.format(timeFormatter));
		case ("Tuesday") -> System.out
				.println("It's Tuesday Date: " + date.format(dateFormatter) + ", Time: " + time.format(timeFormatter));
		case ("Wednesday") -> System.out.println(
				"It's Wednesday Date: " + date.format(dateFormatter) + ", Time: " + time.format(timeFormatter));
		case ("Thursday") -> System.out
				.println("It's Thursday Date: " + date.format(dateFormatter) + ", Time: " + time.format(timeFormatter));
		case ("Friday") -> System.out
				.println("It's Friday Date: " + date.format(dateFormatter) + ", Time: " + time.format(timeFormatter));
		case ("Saturday") -> System.out
				.println("It's Saturday Date: " + date.format(dateFormatter) + ", Time: " + time.format(timeFormatter));
		case ("Sunday") -> System.out
				.println("It's Sunday Date: " + date.format(dateFormatter) + ", Time: " + time.format(timeFormatter));
		default -> System.out.println("Invalid please try again");
		}

	}
}