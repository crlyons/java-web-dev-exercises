package exercises.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> someNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String newPhrase = phrase.replaceAll("\\.", "");


//        System.out.println(sumEven((someNumbers)));
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split(" ")));
            printFiveLetterWords(wordList);

    }
    public static Integer sumEven(ArrayList<Integer> someNumbers){
        int total = 0;
        for( int integer : someNumbers){
            if(integer%2 == 0){
                total += integer;
            }
        }
        return total;
    }

    public static void printFiveLetterWords(ArrayList<String> arr){
        for (String word: arr){
            if (word.length() == 5){
                System.out.println(word);
            }
        }
    }
}
