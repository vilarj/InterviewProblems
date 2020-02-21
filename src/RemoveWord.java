import java.util.ArrayList;

/**
 * Create a function that takes an array and string.
 * The function should remove the letters in the string
 * from the array, and return the array.
 *
 * removeLetters(["s", "t", "r", "i", "n", "g", "w"], "string") ➞ ["w"]
 *
 * removeLetters(["b", "b", "l", "l", "g", "n", "o", "a", "w"], "balloon") ➞ ["b", "g", "w"]
 *
 * removeLetters(["d", "b", "t", "e", "a", "i"], "edabit") ➞ []
 *
 * If number of times a letter appears in the array is greater
 * than the number of times the letter appears in the string,
 * the extra letters should be left behind (see example #2).
 * If all the letters in the array are used in the string,
 * the function should return an empty array (see example #3).
 */
public class RemoveWord {
    public static void main(String[] args) {
        String[] word = {"d","a","n","i","e","l", "x"};

        word = removeLetters(word, "a");

        print(word);
    }

    public static String[] removeLetters (String[] list, String word) {
        String[] newList = new String[list.length];

        for (int i = 0; i < list.length; i++) {
            if (list[i] != word) {
                newList[i] = list[i];
            }
            else {
                newList[i] = "";
            }
        }
        return newList;
    }

    public static void print(String[] word) {
        for (String x : word){
            System.out.print(x + " ");
        }
    }
}
