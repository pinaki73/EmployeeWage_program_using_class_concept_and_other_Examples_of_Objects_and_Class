import java.util.Scanner;

class Student{
    private String name;
    private int rollno;
    private long phonenumber;

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public long getPhonenumber() {
        return phonenumber;
    }
    public void setName(String inputname) {
        this.name = inputname;
    }
    public void setPhone(long phno){
        this.phonenumber = phno;
    }
    public void setroll(int roll){
        this.rollno = roll;
    }
    public void setphone(long phno){
        this.phonenumber = phno;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name");
        String name = sc.nextLine();
        System.out.println("Enter the roll no");
        int roll = sc.nextInt();
        System.out.println("Enter the mobile no");
        long mobile = sc.nextLong();
        Student s1 = new Student();
        s1.setName(name);
        s1.setroll(roll);
        s1.setphone(mobile);
        System.out.println(s1.getName( ));
        System.out.println(s1.getRollno());
        System.out.println(s1.getPhonenumber());

    }
}
