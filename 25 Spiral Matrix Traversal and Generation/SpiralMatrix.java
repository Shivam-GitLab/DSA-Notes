public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                // { 1, 2, 3, 4 },
                // { 5, 6, 7, 8 },
                // { 9, 10, 11, 12 },
                // { 13, 14, 15, 16 }
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        printSpiral(matrix);
        // printMatrix(matrix);
    }

    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    static void printSpiral(int matrix[][]) {
        System.out.println("Hello");
        int r = matrix.length;
        int c = matrix[0].length;
        int totalElement = 0;
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        while (totalElement < r * c) {
            // top row -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow

            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;
            }

            leftCol++;
        }

    }
}
