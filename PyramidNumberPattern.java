public class PyramidNumberPattern {
    static void numberPyramid(int rows) {
        System.out.println("PyramidNumberPattern" + rows);
        int k = 0, count1 = 0, count2 = 0;
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
                count1++;
            }
            while (k != 2 * i - 1) {
                if (count1 <= rows - 1) {
                    System.out.print((i + k) + " ");
                    count1++;
                } else {
                    count2++;
                    System.out.print((i + k - 2 * count2) + " ");
                }
                k++;
            }
            count2 = count1 = k = 0;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numberPyramid(20);
    }
}
