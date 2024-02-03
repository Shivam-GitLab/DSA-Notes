// import java.util.*;
public class ArrSortCheck {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 1, 8, 12, 5, 19 };
        // int arr[] = { 2, 5, 7, 8, 9, 12, 14 };
        System.out.println(checkSorted(arr));
    }

    static boolean checkSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }

        }
        return true;
    }
}
