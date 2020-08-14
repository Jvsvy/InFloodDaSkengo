package com.javacource.TimeBuild;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.spi.CalendarNameProvider;


public class DateTime {
    public static void main(String[] args) {
        Calendar calendar =  Calendar.getInstance();

//        calendar.set(Calendar.HOUR, 19);
//        calendar.set(Calendar.MINUTE, 12);
//        calendar.set(Calendar.SECOND,45);
//        calendar.set(Calendar.MONTH,7);
//
//        calendar.set(Calendar.DAY_OF_MONTH,18);

        System.out.println("Day of month: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.print("Hour: " + calendar.get(Calendar.HOUR));
        System.out.print("  Minute: " + calendar.get(Calendar.MINUTE));
        System.out.print("  Second: " + calendar.get(Calendar.SECOND));

    }
}
