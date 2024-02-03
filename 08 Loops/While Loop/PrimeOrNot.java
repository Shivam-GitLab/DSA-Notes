public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 13;
        int flag = 0;
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
            i++;

        }
        if (flag == 0) {
            System.out.println(n + " is a Prime Num");
        } else {
            System.out.println(n + " is not a Prime Num");
        }

    }

}
