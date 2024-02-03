// import java.util.*;
public class EvenDivisible {
    public static void main(String[] args) {
        int num = 25;
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Hello");
        }

        if (num % 3 == 0 || num % 5 == 0) {
            System.out.println("true");
        }
    }

}
