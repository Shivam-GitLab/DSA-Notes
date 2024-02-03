import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num = ");
        int num = sc.nextInt();
        int Rev = 0;
        for (int i = num; i > 0; i/=10) {
            Rev = (Rev * 10) + (i % 10);
        }
        System.out.print("Reverse = "+Rev);
        sc.close();

    }

}
