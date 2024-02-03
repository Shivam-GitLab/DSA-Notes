import java.util.*;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row = ");
        int r = sc.nextInt();
        System.out.print("Enter Row = ");
        int c = sc.nextInt();
        System.out.println("Enter " + (r * c) + " Elemrnt  = ");
        int arr[][] = new int[r][c];
        // int arr[][] = {
        // { 1, 2, 3, 4 },
        // { 2, 4, 5, 8, 9, 12, 15 },
        // { 8, 7, 9, 5 },
        // };
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        printArray(arr);
        sc.close();
    }

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
