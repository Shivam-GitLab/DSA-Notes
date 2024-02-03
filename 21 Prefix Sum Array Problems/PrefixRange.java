import java.util.*;

public class PrefixRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Arrays Size = ");
        int s = sc.nextInt();
        int arr[] = new int[s + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        prefixSumRange(arr);
        querySelect(arr);
        sc.close();

    }

    public static void prefixSumRange(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }

    public static void querySelect(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Query = ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.print("Enter l = ");
            int l = sc.nextInt();
            System.out.print("Enter r = ");
            int r = sc.nextInt();
            int ans = arr[r] - arr[l - 1];
            System.out.println("Sum = " + ans);
        }
        sc.close();

    }

}
