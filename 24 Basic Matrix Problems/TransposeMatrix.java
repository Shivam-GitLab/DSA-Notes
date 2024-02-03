
public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 4, 5, 6 },

        };

        int ar[][] = new int[3][3];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = arr[j][i];
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

}
