import java.util.*;

public class QueryFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Array Length = ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int N = 100100;
        // creating a frequency array as max(a[i]) < 10^5
        int[] freq = new int[N];
        for (int i = 0; i < n; i++) {
            freq[arr[i]] = freq[arr[i]] + 1;
        }

        int q;
        q = sc.nextInt();
        while (q > 0) {
            int val;
            val = sc.nextInt();
            if (freq[val] > 0) {
                System.out.println("YES");
            } else
                System.out.println("NO");
            q--;
        }
        sc.close();
    }
}