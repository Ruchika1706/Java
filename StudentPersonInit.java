import java.util.Scanner;
class Person {
    private String name;
    private int age;
    public void initPerson(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayPerson(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public int getAge(){
        return this.age;
    }
}
class Student extends Person {
    private int rollno;
    public void initStudent(String name, int age,int rollno){
        this.rollno = rollno;
        this.initPerson(name,age);
    }
    public void displayStudent(){
        this.displayPerson();
        System.out.println(this.rollno);
    }
    public boolean isScholar(){
        if((this.rollno>10) && (this.getAge()>15)){
            return true;
        }
        return false;
    }
}
class StudentPersonInit {
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
        String name;
        int age;
        int rollno;
        Student a[] = new Student[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the name of student");
            name = si.next();
            System.out.println("Enter the rollno of student");
            rollno = si.nextInt();
            System.out.println("Enter the age of student");
            age = si.nextInt();
            a[i] = new Student();
            a[i].initStudent(name, age, rollno);
        }
        for(int i=0;i<size;i++){
            if(a[i].isScholar()){
                a[i].displayStudent();
            }
        }
    }
}