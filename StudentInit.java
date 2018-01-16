import java.util.Scanner;
class Student {
    private int rollno;
    private double marks;
    public void init() {
        System.out.println("Enter the rollnumber");
        Scanner si = new Scanner(System.in);
        rollno = si.nextInt();
        System.out.println("Enter the marks");
        marks = si.nextDouble();
    }
    public void display() {
        System.out.println("rollnumber is");
        System.out.println(rollno);
        System.out.println("marks are");
        System.out.println(marks);
    }
    // This is known as a setter.
    public void setMarks(double number){
        marks = number;
    }
    //getter. getter should have a return type
    public int getRollno() {
        return rollno;
    }
}
class StudentInit {
    public static void main(String args[]){
        Student si = new Student();
        Student sj = new Student();
        int rollno;
        si.init();
        sj.init();
        sj.setMarks(77);
        rollno = sj.getRollno();
        System.out.println(rollno);
    }
}