
// import java.util.*;
import java.util.Arrays;

public class MaxMinArrReturn {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 8, 12, 18, 9, 5 };
        System.out.print("Sort is = ");
        int arrr[] = maxMinReturn(arr);
        for (int i = 0; i < arrr.length; i++) {
            System.out.print(arrr[i] + " ");
        }
    }

    static int[] maxMinReturn(int arr[]) {
        Arrays.sort(arr);
        int sortArr[] = { arr[0], arr[arr.length - 1] };
        return sortArr;
    }
}
