public class NumberBreak {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
            if (i == 7) {
                break;
            }
        }
    }
}
