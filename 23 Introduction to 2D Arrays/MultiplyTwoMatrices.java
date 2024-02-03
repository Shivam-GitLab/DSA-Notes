import java.util.Scanner;

public class MultiplyTwoMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter R1 = ");
        int r1 = sc.nextInt();
        System.out.print("Enter C1 = ");
        int c1 = sc.nextInt();
        System.out.println("Enter " + (r1 * c1) + " Elemrnt = ");
        int a[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter R2 = ");
        int r2 = sc.nextInt();
        System.out.print("Enter C2 = ");
        int c2 = sc.nextInt();
        System.out.println("Enter " + (r2 * c2) + " Elemrnt = ");
        int b[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Multiply Of A x  B = ");
        multiplyMatrix(a, r1, c1, b, r2, c2);
        sc.close();
    }

    static void multiplyMatrix(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Invalid Not Add Possible ");
            return;
        }
        int multiply[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    multiply[i][j] += a[i][k] * b[k][j];
                }
            }

        }
        printArray(multiply, r1, c2);

    }

    static void printArray(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
