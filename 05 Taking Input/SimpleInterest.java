import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principle = ");
        float principle = sc.nextFloat();
        System.out.print("Rate = ");
        float rate = sc.nextFloat();
        System.out.print("Time = ");
        float time = sc.nextFloat();
        float simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }

}
