public class RotateArrayByKStep {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 8, 6, 4, 9 };
        int k = 3;
        int n = arr.length;
        rotateArray(arr, n - k, n - 1);
        // rotateArray(arr, 0, n - k - 1);
        // rotateArray(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void rotateArray(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
