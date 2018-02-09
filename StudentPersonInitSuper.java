import java.util.Scanner;
class Person {
    private String name;
    private int age;
    public void init(){
        System.out.println("Enter the name of Student");
        Scanner sj = new Scanner(System.in);
        this.name = sj.next();
        System.out.println("Enter the age of Student");
        this.age = sj.nextInt();
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public int getAge(){
        return this.age;
    }
}
class Student extends Person {
    private int rollno;
    public void init(){
        super.init();
        System.out.println("Enter the rollno of Student");
        Scanner sj = new Scanner(System.in);
        this.rollno = sj.nextInt();
    }
    
    public void display(){
        super.display();
        System.out.println(this.rollno);
    }
    public boolean isScholar(){
        if((this.rollno>10) && (this.getAge()>15)){
            return true;
        }
        return false;
    }
}
class StudentPersonInitSuper {
    public static void main(String args[]){
        /*
        Student a = new Student();
        a.initStudent("abc",12,23);
        a.displayStudent();
        */
        //create an array of students and find those who are scholars, rollno>10 && age >15
        System.out.println("Enter the size of Student Array");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        Student a[] = new Student[size];
        for(int i=0;i<size;i++){
            a[i] = new Student();
            a[i].init();
        }
        for(int i=0;i<size;i++){
            if(a[i].isScholar()){
                a[i].display();
            }
        }
    }
}