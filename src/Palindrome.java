// Rishi Masand
// University of Illinois at Urbana-Champaign
// CS 126 Fall 2017
// Programming Practice 1 #3

public class Palindrome {

    public static String reverse(String input){

        String reversedString = "";

        for (int i = input.length() - 1; i >= 0; i--){

            reversedString += input.charAt(i);

        }

        return reversedString;

    }

    public static boolean isPalindrome(String input){

        return reverse(input).equals(input);

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar"));

        System.out.println(isPalindrome("taco"));

    }

}
