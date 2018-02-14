import java.util.Scanner;
class Person {
    private String name;
    private int age;
    public void init(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Overriding toString() method inherited from Object's class
    public String toString(){
        return this.name +  " " + this.age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
}
class Student extends Person {
    private int rollno;
    public void init(String name, int age,int rollno){
        super.init(name,age);
        this.rollno = rollno;
    }
    public String toString(){
        System.out.println(super.toString());
        return "" + this.rollno;
    }
    public boolean isSenior(){
        if((this.rollno>100) && (this.getAge()>15) ){
            return true;
        }
        return false;
    }
}
class Teacher extends Person {
    private int experience;
    public void init(String name, int age,int experience){
        super.init(name,age);
        this.experience = experience;
    }
    public String toString(){
        System.out.println(super.toString());
        return " "+ this.experience;
    }
    public boolean isCapableForPrinciple(){
        if((this.experience>10) && (super.getAge()>50)&& (super.getName().toLowerCase().indexOf('s')!=-1)){
            return true;
        }
        return false;
    }
    
    
}
class StudentPersonInit1 {
    public static void main(String args[]){
        /*
        Student a = new Student();
        a.initStudent("abc",12,23);
        a.displayStudent();
        create an array of students and find those who are scholars, rollno>10 && age >15
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
        */
        System.out.println("Enter the size of Student Array");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        //obj is an array of reference for Person's objects.
        Person obj[]= new Person[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter 1 for Student or 2 for Teacher");
            int choice = si.nextInt();
            if(choice==1){
                String name;
                int rollno;
                int age;
                System.out.println("Enter the name of student");
                name = si.next();
                System.out.println("Enter the rollno of student");
                rollno = si.nextInt();
                System.out.println("Enter the age of student");
                age = si.nextInt();
                //Here at run time, obj[i] is a reference which points to memory location having Student object.
                obj[i] = new Student();
                //Here you are sure that init of Student class to be called, explicitly typecast the object to call the function
                ((Student)obj[i]).init(name,age,rollno);
            } else if (choice==2){
                String name;
                int experience;
                int age;
                System.out.println("Enter the name of teacher");
                name = si.next();
                System.out.println("Enter the experience of teacher");
                experience = si.nextInt();
                System.out.println("Enter the age of teacher");
                age = si.nextInt();
                obj[i] = new Teacher();
                ((Teacher)obj[i]).init(name,age,experience);
            }else {
                System.out.println("Invalid choice");
                System.exit(0);
            }
            
        }
        for(int i=0;i<size;i++){
            /*if(obj[i] instanceof Student) {
                System.out.println("Senior "+ ((Student)obj[i]).isSenior());
            } else if(obj[i] instanceof Teacher){
                System.out.println("Capable for Principle "+ ((Teacher)obj[i]).isCapableForPrinciple());
            }*/
            //Here the toString() function would be automatically called. obj[i].toString().
            System.out.println(obj[i]);
            
        }
    }
}