public class SuffixSum {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 12 };
        int n = arr.length - 1;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] += arr[i + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
