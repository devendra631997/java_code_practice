package string;
import java.util.*;

public class string_anagram {
    public static Boolean anagram(String str1, String str2) {
        char [] strt1 = str1.toLowerCase().toCharArray();
        char [] strt2 = str2.toLowerCase().toCharArray();
        Arrays.sort(strt1);
        Arrays.sort(strt2);
        return strt1 == strt2 ? true:false;
        
    }
    public static void main(String[] args) {
        System.out.println(anagram("str1","s1rt"));
    }
}
