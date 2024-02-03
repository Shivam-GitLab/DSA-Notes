public class Unary {
    public static void main(String[] args) {
        /*
         * # Unary Operator
         * +  -  Unary Plus Operator
         * -  -  Unary Minus Operator
         * ++ -  Increment Operator [ Pre & Post ]
         * -- -  Decrement Operator [ Pre & Post ]
         * !  -  Logical Complement Operator
         */
        System.out.println("Unary Operator");
        int a = 6,b = 5;
        System.out.println((++a)*(b++));
        System.out.println((++a)*(++b));
        System.out.println((a++)*(a++));
        System.out.println((++b)*(a++));
        System.out.println((b++)*(a++));
        System.out.println((a++)*(++b));
        

    }

}

