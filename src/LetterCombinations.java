// Rishi Masand
// University of Illinois at Urbana-Champaign
// CS 126 Fall 2017
// Programming Practice 1 #4

public class LetterCombinations {

    public static void withLoops(){

        char[] letters = { 'a', 'b' };

        int[] letterIndices = { 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < 64; i++){

            String combination = "";

            for (int j = 0; j < 6; j++){

                combination += letters[letterIndices[j]];

            }

            System.out.println(combination);

            for (int j = 5; j >= 0; j--){

                if (letterIndices[j] == 0) {

                    letterIndices[j] = 1;

                    if (j + 1 < 6) {

                        letterIndices[j + 1] = 0;

                    }

                    break;

                }
                else if (j + 1 < 6){

                    letterIndices[j] = 0;

                    letterIndices[j + 1] = 0;

                }

            }

        }

    }

    static char[] lettersRecursive = { 'a', 'b' };

    static int[] letterIndicesRecursive = { 0, 0, 0, 0, 0, 0 };

    public static void increment(int index){

        if (index >= 0){

            if (letterIndicesRecursive[index] == 0) {

                letterIndicesRecursive[index] = 1;

                if (index + 1 < 6) {

                    letterIndicesRecursive[index + 1] = 0;

                }

                return;

            }
            else if (index + 1 < 6){

                letterIndicesRecursive[index] = 0;

                letterIndicesRecursive[index + 1] = 0;

            }

            increment(index - 1);

        }
        else {

            return;

        }

    }

    public static String combinator(String combinationString, int letterCount){

        if (letterCount < 6){

            combinationString += lettersRecursive[letterIndicesRecursive[letterCount]];

            return combinator(combinationString, letterCount + 1);

        }
        else {

            return combinationString;

        }

    }

    public static void stringBuilder(int stringCount){

        if (stringCount < 64){

            String combination = "";

            combination = combinator(combination, 0);

            System.out.println(combination);

            increment(5);

            stringBuilder(stringCount + 1);

        }

    }

    public static void withRecursion(){

        stringBuilder(0);

    }

    public static void main(String[] args) {

        withLoops();

        withRecursion();

    }

}
