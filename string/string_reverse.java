package string;

import java.util.*;

public class string_reverse {
    public static String stringReverse(String str) {
        char ch[] = str.toCharArray();
        String reversedString = "";
        for (char s : ch) {
            reversedString = s + reversedString;
        }
        return reversedString;
    }

    public static Boolean palindrome(String str) {
        return str.equals(stringReverse(str)) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(stringReverse(str));
        System.out.println(palindrome(str));
    }

}
