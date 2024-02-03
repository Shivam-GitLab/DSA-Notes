public class PrefixSumWithoutExtraSpace {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4, 5 };
        prefixSum(arr);
        printArr(arr);

    }

    public static void prefixSum(int arr[]) {
        // arr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // arr[i] = arr[i - 1] + arr[i];
            arr[i] += arr[i - 1];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
