
public class TransposeInPlace {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 2 },
                { 4, 5, 6, 2 },
                { 7, 8, 9, 2 },
                { 7, 8, 9, 2 }

                // 3 x 3 4 x 4
        };

        // int ar[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {

            // j = i Because j = 0 When then Twice Swap Then Original Value as it
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
