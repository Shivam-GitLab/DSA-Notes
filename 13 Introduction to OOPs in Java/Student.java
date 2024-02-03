// in java file only one public class which name .java file name
public class Student {
    int rollNo = 223033; // default value = 0
    String studentName = "Shivam Kumar"; // default value = null

    public static void main(String[] args) {
        Shivam obj1 = new Shivam();
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);
        Shivam obj2 = new Shivam();
        obj2.rollNo = 23;
        System.out.println(obj2.rollNo);
        obj2.studentName = "Rahul Jha";
        System.out.println(obj2.studentName);
        System.out.println();
    }
}

class Shivam {
    int rollNo = 225;
    String studentName;
}
