public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4, 5 };
        int prefix[] = makePrefixSum(arr);
        printArray(prefix);

    }

    public static int[] makePrefixSum(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        // i >= 1 // 1-1 = 0 // 0 - 1 = -1 wrong
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}