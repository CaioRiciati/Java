package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class data {
	public static void main(String[] args) {
		
		
		LocalDate data4 = LocalDate.parse("2022-02-03");
		LocalDateTime data5 = LocalDateTime.parse("2022-02-03T01:30:23");
		Instant data6 = Instant.parse("2022-02-03T01:30:23Z");
		
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH: mm");
		DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH: mm").withZone(ZoneId.systemDefault());
		
		
		LocalDate dataAgr = LocalDate.now();
		LocalDateTime dataagrr = LocalDateTime.now();
		System.out.println(dataAgr.format(formato1));
		System.out.println(dataagrr.format(formato2));
		
		
	}
}
