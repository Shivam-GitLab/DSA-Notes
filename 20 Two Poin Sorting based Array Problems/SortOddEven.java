
public class SortOddEven {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 3 };
        sortOddEven(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortOddEven(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }

            if (arr[i] % 2 == 0) {
                i++;

            }
            if (arr[j] % 2 == 1) {
                j--;
            }
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
