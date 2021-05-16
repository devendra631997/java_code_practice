public class linearSearch {
    static int search(int arr[], int num)
    {
        for (int i : arr) {
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int num = 5;
        int result =search(arr,num);
        System.out.println(result);
    }
}
