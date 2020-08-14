package com.javacource.se.lesson14;
import com.javacource.se.lesson14.Month;
public class MonthTest {
    public static void main(String[] args) {
        Month m = new Month();
        switch (m.show("August")){
            case "January":
                System.out.println("serial number - 1, Amount of days - 31"); break;
            case "February":
                System.out.println("serial number - 2, Amount of days - 28"); break;
            case "March":
                System.out.println("serial number - 3, Amount of days - 31"); break;
            case "April":
                System.out.println("serial number - 4, Amount of days - 30"); break;
            case "May":
                System.out.println("serial number - 5, Amount of days - 31"); break;
            case "June":
                System.out.println("serial number - 6, Amount of days - 30"); break;
            case "July":
                System.out.println("serial number - 7, Amount of days - 31"); break;
            case "August":
                System.out.println("serial number - 8, Amount of days - 31"); break;
            case "September":
                System.out.println("serial number - 9, Amount of days - 30"); break;
            case "November":
                System.out.println("serial number - 10, Amount of days - 30"); break;
            case "December":
                System.out.println("serial number - 11, Amount of days - 31"); break;
            default:
                System.out.println("Idi nahuy, netu takogo mesyaca"); break;
        }
    }
}
