package com.curso.java8.dateapi;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class DateApiApp {

	public static void main(String[] args) {
		DayOfWeek dayOfWeek = LocalDate.parse("2023-05-18").getDayOfWeek();
		System.out.println(dayOfWeek);

		System.out.println(LocalDate.parse("2023-05-18").getDayOfMonth());
		LocalDate hoy = LocalDate.now();

		System.out.println(hoy);

		LocalDate ayer = hoy.minusDays(1);
		System.out.println(ayer);
		System.out.println(hoy.isLeapYear());
		System.out.println(hoy.minus(2, ChronoUnit.WEEKS));

		System.out.println(ayer.isBefore(hoy));

		LocalDateTime ahora = LocalDateTime.now();
		System.out.println(ahora);

		System.out.println(hoy.atStartOfDay());

		System.out.println(LocalDate.parse("2023-02-12").with(TemporalAdjusters.lastDayOfMonth()));

		System.out.println(LocalDate.of(2023, 3, 12));

		Clock clock = Clock.systemDefaultZone();
		System.out.println(LocalDateTime.now(clock));

		ZoneId zoneId = ZoneId.of("Asia/Karachi");
		System.out.println(LocalDateTime.now(zoneId));

		// Conversiones
		Date date = new Date();

		LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		System.out.println(localDateTime);

		Calendar calendar = Calendar.getInstance();
		LocalDateTime localCalendarTime = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
		
		System.out.println(Period.between(ayer, hoy).getDays());
		
		LocalDateTime localFutureTime = ahora.plus(Duration.ofMinutes(15));
		System.out.println(localFutureTime);
		
	}

}
