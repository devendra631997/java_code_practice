public class arrays {
    public static void main(String[] args) {
        String[] nums = { "1", "2", "3", "4" };
        System.out.println(nums[0]);
        nums[0] = "2";
        System.out.println(nums[0]);
        System.out.println(nums.length);
        for (String i : nums) {
            System.out.println(i);
        }

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int x = myNumbers[1][1];
        System.out.println(x);
    }
}
