package string;
import java.lang.reflect.Array;
import java.util.Scanner;
public class first_non_repeating_character {
    public static Integer countOccuranceOfCharacterInString(char c,char[] str) {
        Integer count = 0;
        for (char d : str) {
            if(d == c) count ++;
        }
        return count;
    }
    public static String firstNonRepeatingCharacter(String str) {
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if(countOccuranceOfCharacterInString(c,charArray) == 1){
                return Character.toString(c);
            };
        }
        return "No";  
    }
    public static Integer countNoOfWords(String str) {
        if(str==null){
            return 0;
        }
        String newStr = str.trim();
        System.out.println(str.split("//s+"));
        int count = newStr.isEmpty() ? 0 : newStr.split("//s+").length;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(firstNonRepeatingCharacter(str));
        String str2 = sc.nextLine();
        System.out.println(countNoOfWords(str2));
        sc.close();
    }
}
