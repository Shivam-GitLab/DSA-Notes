
public class TrianglularPattern {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }

        System.out.println("Opposite");
        System.out.println();
        // Opposite

        for (int i = r; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r + 1 - i); j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }

}
