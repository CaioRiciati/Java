package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Data3 {
	public static void main(String[] args) {
		
		
		LocalDate data4 = LocalDate.parse("2022-02-03");
		LocalDateTime data5 = LocalDateTime.parse("2022-02-03T01:30:23");
		Instant data6 = Instant.parse("2022-02-03T01:30:23Z");

		LocalDate PastWeekLocalDate = data4.minusDays(7);
		LocalDate NextWeekLocalDate = data4.plusDays(7);
		
		System.out.println("PastWeekLocalDate = "+ PastWeekLocalDate);
		
		Instant pastWeekInstant = data6.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = data6.plus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		Duration d1 = Duration.between(PastWeekLocalDate.atStartOfDay(), NextWeekLocalDate.atTime(0,0));
		System.out.println(d1.toDays());
	}

	
}
