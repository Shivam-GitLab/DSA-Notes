public class ArrSum {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 8 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("Sum of arr is = " + sum);
    }
}
