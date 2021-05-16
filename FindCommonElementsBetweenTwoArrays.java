import java.util.*;

public class FindCommonElementsBetweenTwoArrays {
    static void commanElement(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<>();
        System.out.println("FindCommonElementsBetweenTwoArrays");
        for (String string : arr1) {
            for (String string2 : arr2) {
                if (string == string2) {
                    set.add(string);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr1 = { "i", "am", "devendra", "kumar", "singh" };
        String[] arr2 = { "i", "singh", "am" };
        commanElement(arr1, arr2);
    }
}
