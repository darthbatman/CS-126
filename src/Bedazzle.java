// Rishi Masand
// University of Illinois at Urbana-Champaign
// CS 126 Fall 2017
// Lecture 1

public class Bedazzle {

    public static String bedazzle(String input){

        String b = "";

        for (int i = 0; i < input.length(); i++){

            if (input.charAt(i) == ' '){

                if (i > 0 && input.charAt(i - 1) != ' '){

                    b += "*";

                }

                b += "  ";

            }
            else {

                b += "*";

                b += input.charAt(i);

                if (i == input.length() - 1){

                    b += "*";

                }

            }

        }

        return b;

    }

    public static void main(String[] args) {

        System.out.println(bedazzle("This is my string"));

    }

}
