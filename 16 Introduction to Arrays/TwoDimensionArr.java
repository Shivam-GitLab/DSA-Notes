public class TwoDimensionArr {
    public static void main(String[] args) {
        int arr[][] = { { 2, 5, 7, 8 },
                { 5, 4, 7, 9 },
                { 1, 3, 5, 7, 12 } };

        // for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
