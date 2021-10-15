package string;

import java.util.*;

public class duplicate_words_in_string {
    public static Set<String> duplicateWordsInString(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<>();
        String[] words = str.split("\\s+");
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (!set.add(word)) {
                duplicates.add(word);
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println("Input: " + str);
        System.out.println(duplicateWordsInString(str));
    }

}
