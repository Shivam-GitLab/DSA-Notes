
public class ReverseWithoutSpace {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 4 };
        changeArr(arr);
    }

    public static void revArr(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void changeArr(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            revArr(arr, i, j);
            i++;
            j--;
        }
        printArr(arr);

    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
