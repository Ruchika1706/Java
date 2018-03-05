import java.util.Scanner;
class Person {
    private String name;
    private int age;
    public Person() {
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the name of Person");
        this.name = si.next();
        System.out.println("Enter the age of Person");
        this.age = si.nextInt();
    }
    public void display(){
        System.out.println("Name: "+ this.name + "Age: "+ this.age);
    }
}
class Subject {
    private String name;
    private int marks;
    public Subject(){
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the name of Subject");
        this.name = si.next();
        System.out.println("Enter the marks of Subject");
        this.marks = si.nextInt();
        
    }
    public int getMarks(){
        return this.marks;
    }
    public void display(){
        System.out.println("Subject Name: "+ this.name + "Marks: "+ this.marks);
    }
}
class Student {
    Person ob;
    Subject arr[];
    public Student(){
        ob = new Person();
        /*
        System.out.println("Enter the number of subject for this student");
        Scanner si = new Scanner(System.in);
        int number = si.nextInt();
        */
        arr = new Subject[5];
        int i=0;
        String choice=new String();
        do {
            System.out.println("Do you have a subject yes or no");
            Scanner si = new Scanner(System.in);
            choice = si.next();
            if(choice.equalsIgnoreCase("yes")){
                System.out.println("Choice: "+ choice);
                arr[i] = new Subject();
            }
            i = i+1;
        }while(choice.equalsIgnoreCase("yes")&&(i<5));
    }
    public int totalMarks(){
        int total = 0;
        for(int i=0;i<this.arr.length;i++){
            if(this.arr[i] != null)
            total += arr[i].getMarks();
        }
        return total;
    }
    public void display(){
        this.ob.display();
        for(int i=0;i<this.arr.length;i++){
            if(this.arr[i] != null)
            this.arr[i].display();
        }
    }
    public void getHighestScore(){
        Subject highest =  this.arr[0];
        for(int i=0;i<this.arr.length;i++){
            if(this.arr[i] != null){
                if(this.arr[i].getMarks()>highest.getMarks()){
                    highest =this.arr[i];
                }
            }
        }
       highest.display();
    }
}
class DriverPerson {
    public static void main(String args[]){
        /*
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the size of Student Array");
        int size = si.nextInt();
        Student temp[] = new Student[size];
        for(int i=0;i<size;i++){
            temp[i] = new Student();
        }
        int max=-1;
        int index =-1;
        for(int i=0;i<size;i++){
            if(temp[i].totalMarks() > max) {
             max = temp[i].totalMarks();
             index = i;
            }
        }
        System.out.println("Student with maximum marks is" + ":" +  temp[index].totalMarks());
        temp[index].display();
        */
        Student ob = new Student();
        ob.getHighestScore();
    }
}