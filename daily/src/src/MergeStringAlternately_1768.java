package src;

import java.util.Scanner;

public class MergeStringAlternately_1768 {
    static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int m = word1.length();
        int n = word2.length();
        for(int i = 0 ; i < Math.max(m, n); i++) {
            if ( i < m) {
                result.append(word1.charAt(i));
            }
            if ( i < n ) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w1 = scanner.nextLine();
        String w2 = scanner.nextLine();
        System.out.println(mergeAlternately(w1, w2));
    }
}