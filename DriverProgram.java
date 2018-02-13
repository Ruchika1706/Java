import java.util.Scanner;
class Person {
    private String name;
    private int age;
    public void init(){
        System.out.println("Enter the name of Person");
        Scanner si = new Scanner(System.in);
        this.name = si.next();
        System.out.println("Enter the age of Person");
        this.age = si.nextInt();
    }
    public void display(){
        System.out.print(name + " " + age);
    }
}
class Student extends Person{
    private int rollno;
    public void init(){
        super.init();
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the rollno of Student");
        this.rollno = si.nextInt();
    }
    public void display(){
        super.display();
        System.out.print(" "+ rollno+ " ");
    }
    
}
class Teacher extends Person{
    private int experience;
    public void init(){
        super.init();
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the experience of Teacher");
        this.experience = si.nextInt();
    }
    public void display(){
        super.display();
        System.out.print(" "+ experience+ " ");
    }
}
class DriverProgram {
    public static void main(String args[]){
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the size of Person array");
        int size = si.nextInt();
        Person obj[] = new Person[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter 1 to Store a student obj or 2 to store a Teacher's obj");
            int choice = si.nextInt();
            if(choice ==1){
                obj[i] = new Student();
                obj[i].init();
                //obj[i].display();
             }
            else if(choice ==2){
                obj[i] = new Teacher();
                obj[i].init();
                //obj[i].display();
            }
            else {
                System.out.println("Invalid choice");
                System.exit(0);
            }
        }
        for(int i=0;i<size;i++){
            obj[i].display();
        }
    }
}