public class Logical {
    public static void main(String[] args) {
        /*
         * # Logical Operator
         * && - Logical AND [ Bot True Then = True , Bot False Then = False]
         * || - Logical OR [ ]
         * ! - Logical NOT
         */
        int p = 15, q = 10, r = 5;
        System.out.println("Logical Operator");
        // && operator
        System.out.println((p > q) && (p > r)); // true
        System.out.println((p > q) && (p < r)); // false

        // || operator
        System.out.println((r < q) || (p < q)); // true
        System.out.println((p > q) || (q > r)); // true
        System.out.println((p < q) || (p < r)); // false

        // ! operator
        System.out.println(!(p == q)); // true
        System.out.println(!(p > q)); // false

        int a = 10, b = 20;
        if (a < b && a <= b) {
            System.out.println("True");
        }
        if (a < b || a <= b) {
            System.out.println("True");
        }

        System.out.println(!(2 == 3));
        /*
         * True Convert False
         * False Convert True
         */

    }

}
