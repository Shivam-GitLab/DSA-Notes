
public class PowerAB {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println("Power of a & b = " + ans);
       
    }
}
