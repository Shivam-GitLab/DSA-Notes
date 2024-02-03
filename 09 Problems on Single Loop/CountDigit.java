import java.util.*;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num = ");
        int num = sc.nextInt();
        int count = 0;

        // Formula [ Count ]
        // int count = (int) (Math.log10(num) + 1);

        while (num != 0) {
            num /= 10;
            count++;
        }

        // for (int i = num; i != 0; i /= 10) {
        // count++;
        // }
        System.out.println("Total Digit = " + count);

        sc.close();
    }

}
