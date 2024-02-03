
public class SwapWithoutThirdvar {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        swapNum(a, b);
    }

    static void swapNum(int a, int b) {
        System.out.println("Before Swap a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap a = " + a + " b = " + b);

    }
}
