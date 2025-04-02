package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class data {
	public static void main(String[] args) {
		LocalDate data = LocalDate.now();
		LocalDateTime data2 = LocalDateTime.now();
		Instant data3 = Instant.now();
		
		LocalDate data4 = LocalDate.parse("2022-02-03");
		LocalDateTime data5 = LocalDateTime.parse("2022-02-03T01:30:23");
		Instant data6 = Instant.parse("2022-02-03T01:30:23Z");
		Instant data7 = Instant.parse("2022-02-03T01:30:23+03:00");
		
		System.out.println(data);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		System.out.println(data5);
		System.out.println(data6);
		System.out.println(data7);
	}
}
