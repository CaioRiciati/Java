package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Data2 {
	public static void main(String[] args) {
		
		
		LocalDate data4 = LocalDate.parse("2022-02-03");
		LocalDateTime data5 = LocalDateTime.parse("2022-02-03T01:30:23");
		Instant data6 = Instant.parse("2022-02-03T01:30:23Z");
		
		LocalDate r1 = LocalDate.ofInstant(data6, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(data6, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(data6, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(data6, ZoneId.of("Portugal"));
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println("D04 dia = "+ data4.getDayOfMonth());
		System.out.println("D04 mes = "+ data4.getMonth());
		System.out.println("D04 ano = " +data4.getYear());
		
	}
}
		