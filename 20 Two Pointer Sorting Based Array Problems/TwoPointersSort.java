public class TwoPointersSort {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        sortZeroesAndOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortZeroesAndOne(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] > arr[j]) {
                swap(arr, i, j);
            }
            i++;
            j--;
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
