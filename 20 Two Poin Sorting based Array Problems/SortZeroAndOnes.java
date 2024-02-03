public class SortZeroAndOnes {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        sortZeroAndOnes(arr);

    }

    public static void sortZeroAndOnes(int[] arr) {
        int zeroes = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}