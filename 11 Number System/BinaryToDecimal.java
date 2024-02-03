import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Binary Number = ");
        int binNum = sc.nextInt();
        System.out.print("Decimlal Number = " + binToDecimal(binNum));
        binaryToDecimal(binNum);
        sc.close();
    }

    public static int binToDecimal(int num) {
        int pow = 1;
        int Decimal = 0;
        while (num != 0) {
            int lastDigit = (num % 10);
            Decimal += lastDigit * pow;
            pow *= 2;
            num /= 10;
        }
        return Decimal;
    }

    public static void binaryToDecimal(int num) {
        int pow = 0;
        int decimalNum = 0;
        while (num != 0) {
            int lastDigit = (num % 10);
            decimalNum += lastDigit * (int) (Math.pow(2, pow));
            num /= 10;
            pow++;
        }
        System.out.println();
        System.out.print("Decimal Number = " + decimalNum);
    }
}
