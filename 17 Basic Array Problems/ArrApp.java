import java.util.*;

public class ArrApp {
    static void changeArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        // int arr[] = { 2, 4, 5, 6 };
        arr[0] = 53;
        arr[1] = 55;
        arr[2] = 51;

        changeArr(arr);
        printArr(arr);

        sc.close();
    }
}
