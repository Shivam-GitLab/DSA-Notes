import java.util.*;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num = ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum -= i;
            }
            else{
                sum += i;
            }
        }
        System.out.println("Sum of Series = "+sum);
        sc.close();
    }
}