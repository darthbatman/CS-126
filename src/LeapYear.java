// Rishi Masand
// University of Illinois at Urbana-Champaign
// CS 126 Fall 2017
// Programming Practice 1 #2

public class LeapYear {

    public static void main(String[] args) {

        int year = 2017;

        int leapYearCount = 0;

        while (leapYearCount < 20){

            year++;

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){

                System.out.println(year);

                leapYearCount++;

            }

        }

    }

}
