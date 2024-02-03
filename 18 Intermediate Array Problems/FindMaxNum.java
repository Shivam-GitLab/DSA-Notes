
public class FindMaxNum {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 10, 23, 45, 12, 15 };
        System.out.print("Max Num = " + findMax(arr));
    }

    static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min Num = " + min);
        return max;
    }
}
