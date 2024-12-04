//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        Main test = new Main();
        System.out.println(test.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        int a[] = new int[10001];
        int cnt = 0;
        for (int i = 0; i < haystack.length(); i++) {
            haystack.indexOf()
        }
        return -1;
    }
}