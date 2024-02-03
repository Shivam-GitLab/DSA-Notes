import java.util.*;

public class CountArrNum {

    static int countOccurences(int arr[], int target) {
        int countArrNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                countArrNum++;
            }
        }
        return countArrNum;
    }

    static int lastOccurences(int arr[], int target) {
        int countArrNum = -1;
        for (int i = 0; i < arr.length; i++) {
            // if (arr[i] == target) {
            if (arr[i] > target) {
                countArrNum = arr[i];
                // return countArrNum;
            }
        }
        return countArrNum;
        // return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 1, 5, 7, 5, 112, 100 };
        int target = 5;
        // countOccurences(arr, target);
        System.out.println("Count Arr Num = " + countOccurences(arr, target));
        System.out.println("Count last Arr Num = " + lastOccurences(arr, target));

        sc.close();
    }
}
