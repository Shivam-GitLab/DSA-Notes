public class NumContinue {
    public static void main(String[] args) {
        int num = 50;
        myLoop: for (int i = 1; i < num; i++) {

            if ((i % 3 == 0)) {
                continue myLoop;
            }
            System.out.print(i + " ");

        }
        // int i = 1;
        // while (i <= 50) {
        // if (i % 3 == 0) {
        // // i++;
        // continue;
        // }
        // System.out.print(i + " ");
        // i++;

        // }
    }

}
