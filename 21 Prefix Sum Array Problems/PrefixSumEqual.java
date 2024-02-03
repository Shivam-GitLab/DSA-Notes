public class PrefixSumEqual {
    public static void main(String[] args) {
        // int arr[] = { 1, 1, 1, 1, 1, 1, };
        int arr[] = { 1, 3, 5, 6, 2, 1 };
        boolean check = equalSumParticion(arr);
        System.out.println(check);
    }

    public static int totalSum(int arr[]) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    public static boolean equalSumParticion(int arr[]) {
        int totalSum = totalSum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if (prefSum == suffixSum) {
                return true;
            }
        }
        return false;

    }
}
