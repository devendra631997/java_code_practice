package string;
import java.util.*;

public class generate_random_string {
    public static String generateRandomString(Integer n) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = n;
        for(int i = 0; i < length; i++) {
          int index = random.nextInt(alphabet.length());
          char randomChar = alphabet.charAt(index);
          sb.append(randomChar);
        }
        String randomString = sb.toString();
        return randomString;
    }

    public static void main(String[] args) {
        System.out.println(generateRandomString(7));
    }
}
