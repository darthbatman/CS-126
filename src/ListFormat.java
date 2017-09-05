// Rishi Masand
// University of Illinois at Urbana-Champaign
// CS 126 Fall 2017
// Lecture 3

public class ListFormat {

    public static String toString(String[] array) {

        String formattedString = "";

        for (int i = 0; i < array.length; i++){

            formattedString += array[i];

            if (i != array.length - 1){

                formattedString += ", ";

            }

            if (i == array.length - 2){

                formattedString += "and ";

            }

        }

        return formattedString;

    }

    public static void main(String[] args) {

        System.out.println(toString(new String[] { "thing1", "thing2", "thing3" }));

    }

}