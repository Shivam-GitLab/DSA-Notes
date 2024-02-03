import java.util.Scanner;

class Algebras {
    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}

public class Maths {
    public static void main(String[] args) {
        Algebras obj = new Algebras();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Num = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of input num is = ");
        int ans = obj.add(a, b);
        System.out.println(ans);
        sc.close();
    }
}
