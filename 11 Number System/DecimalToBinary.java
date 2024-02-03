import java.util.*;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimlal Number = ");
        int decNum = sc.nextInt();
        System.out.print("Binary Number = " + decToBinary(decNum));
        binaryToDecimal(decNum);
        sc.close();
    }

    public static int decToBinary(int num) {
        int pow = 1;
        int binary = 0;
        while (num > 0) {
            int lastDigit = (num % 2);
            binary += lastDigit * pow;
            pow *= 10;
            num /= 2;
        }
        return binary;
    }

    public static void binaryToDecimal(int num) {
        int pow = 0;
        int binary = 0;
        while (num != 0) {
            int lastDigit = (num % 2);
            binary += lastDigit * (int) (Math.pow(10, pow));
            num /= 2;
            pow++;
        }
        System.out.println();
        System.out.print("Binary Number = " + binary);
    }
}
