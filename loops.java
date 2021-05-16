public class loops {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("While loop");
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Do while
        System.out.println("Do While loop");
        do {
            System.out.println(i);
            i++;
        } while (i <= 9);

        // for loop
        System.out.println("for loop");
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // for each
        System.out.println("for Each loop");
        String[] nums = { "1", "2", "3", "4" };
        for (String str : nums) {
            System.out.println(str);
        }

        // loop break
        System.out.println("loop break");
        for (i = 0; i < 10; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }

        // loop continue
        System.out.println("loop continue");
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
