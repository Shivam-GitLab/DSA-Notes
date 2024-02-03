import java.util.*;
public class TakeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lucky num = ");
        int num = sc.nextInt();
        System.out.println("lucky num is = "+num);
        

        System.out.print("Enter name = ");
        String name = sc.next();
        System.out.println("Name is "+name);
        // Shivam  Jha = Shivam Only Space not print
        // But 


        System.out.println("Enter Name = ");
        String nme = sc.nextLine(); // Shivam Jha = Shivam Jha
        // Space Consider
        System.out.println(nme);

        




       sc.close();
    }
    
}
