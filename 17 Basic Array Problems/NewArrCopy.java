import java.util.*;
import java.util.Arrays;;

public class NewArrCopy {

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 5, 8, 7, 9, 12, 14, 17 };
        System.out.print("Original Arr = ");
        printArr(arr);
        System.out.println();
        copyArr(arr);
        sc.close();

    }

    static void copyArr(int arr[]) {
        // int arr_2[] = arr;
        // new Space memory not allocte in Heap memory
        // arr - address copy - lets arr address - 101 New arr_2 = 101 address copy

        // int arr_2[] = arr.clone();
        // new Space memory allocte in Heap memory

        // int arr_2[] = Arrays.copyOf(arr, arr.length);
        // give length

        int arr_2[] = Arrays.copyOfRange(arr, 3, arr.length);

        System.out.print("Copied Arr = ");
        printArr(arr_2);
        arr_2[0] = 0;
        arr_2[1] = 0;
        arr[0] = 12;
        arr[1] = 29;
        System.out.println();
        System.out.print("Change Value ");
        printArr(arr);
        System.out.println();
        printArr(arr_2);
    }
}
