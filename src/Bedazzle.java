// Rishi Masand
// University of Illinois at Urbana-Champaign
// CS 126 Fall 2017
// Lecture 1

public class Bedazzle {

    public static String bedazzle(String input){

        String b = "";

        for (int i = 0; i < input.length(); i++){

            b += input.charAt(i);

            if (input.charAt(i) == ' '){

                b += " ";

            }
            else {

                b += "*";

            }

        }

        return b;

    }

    public static void main(String[] args) {

        System.out.println(bedazzle("This is my string"));

    }

}
