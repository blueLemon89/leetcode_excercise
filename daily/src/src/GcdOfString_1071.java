package src;

import java.util.Scanner;

public class GcdOfString_1071 {
    public static String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w1 = scanner.nextLine();
        String w2 = scanner.nextLine();

        System.out.println(gcdOfStrings(w1, w2));
    }
}
