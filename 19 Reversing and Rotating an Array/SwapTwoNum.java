
public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        swapNum(a, b);
    }

    static void swapNum(int a, int b) {
        System.out.println("Before Swap a = " + a + " b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap a = " + a + " b = " + b);
    }

}
