// import java.util.*;

public class FindUnique {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 13, 2, 3, 5 };
        findUnique(arr);
    }

    static void findUnique(int arr[]) {
        // int num = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
