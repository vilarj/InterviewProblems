
import java.util.Arrays;
import java.util.Scanner;

/**
 * This program simulates an Anagram.
 * An anagram is a word or phrase formed by rearranging
 * the letters of a different word or phrase, typically
 * using all the original letters exactly once.[1]
 * For example, the word anagram can be rearranged into
 * nag a ram, or the word binary into brainy or
 * the word adobe into abode
 */
public class Anagram {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String word1, word2;

        System.out.print("Enter the first word: ");
        word1 = input.next();
        System.out.print("Enter the first word: ");
        word2 = input.next();

        System.out.print(Anagram(word1, word2));
    }

    public static boolean Anagram (String A, String B) {
        String[] newA = new String[A.length()];
        String[] newB = new String[B.length()];

        for (int i = 0; i < A.length(); i++) {
            newA[i] = String.valueOf(A.charAt(i));
        }

        for (int i = 0; i < A.length(); i++) {
            newB[i] = String.valueOf(B.charAt(i));
        }

        Arrays.sort(newA);
        Arrays.sort(newB);

        for (int i = 0; i < newA.length; i++) {
            for (int k = 0; k < newB.length; k++) {
                if (newA[i] == newB[k]){return true;}
                return false;
            }
        }
        return true;
    }
}
