public class EvenOdd {
    public static void main(String[] args) {
        int num = 12;
        
        if(num%2==0){
            System.out.println(num+" is a Even num");
        }
        if(num%2!=0){
            System.out.println(num+" is a Odd num");
        }
        else{
            System.out.println(num+" is a Odd num");
        }

        String ans;
        ans = (num%2==0)? "Even":"odd";
        System.out.println(ans);
    }

}
