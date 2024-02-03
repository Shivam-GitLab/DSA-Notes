import java.util.*;

public class ReverseNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num = ");
        int num = sc.nextInt();
        int org = num;
        int rev = 0;
        while (num != 0) {
            rev = (rev * 10) + num % 10;
            num /= 10;
        }
        System.out.println("Original = " + org);
        System.out.println("Reverse = " + rev);

        if (org == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}