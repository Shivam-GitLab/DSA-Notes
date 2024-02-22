public class NumericalPattern {
    public static void main(String[] args) {
        int r = 7;
        for (int i = 1; i < r; i++) {
            for (int j = i; j <= r; j++) {
                System.out.print(j);
            }
            // k also take ok
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
