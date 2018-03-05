/*Example showing Object class reference array can be created and can refer to objects of all other classes since each class inherit object by default
*/
import java.util.Scanner;

class Subject {
    private String subname;
    private int std;
    public void init(){
        System.out.println("Enter the name of the subject");
        Scanner si = new Scanner(System.in);
        this.subname = si.next();
        System.out.println("Enter the std in which the subject is taught");
        this.std = si.nextInt();
    }
    public void display(){
        System.out.println("Subject Name: " + this.subname + "Std: "+ this.std);
    }
}

class Person  {
    private String name;
    private int age;
    public void init(){
        System.out.println("Enter the name of the person");
        Scanner si = new Scanner(System.in);
        this.name = si.next();
        System.out.println("Enter the age of person");
        this.age = si.nextInt();
    }
    public void display(){
        System.out.println("Name: " + this.name + "Age: "+ this.age);
    }
}
class Complex {
    private int real;
    private int imaginary;
    public void init(){
        System.out.println("Enter the real part of complex number");
        Scanner si = new Scanner(System.in);
        this.real = si.nextInt();
        System.out.println("Enter the imaginary part of complex number");
        this.imaginary = si.nextInt();
    }
    public void display(){
        System.out.println("Real: " + this.real + "Imaginary: "+ this.imaginary);
    }
}


class Driver{
    public static void main(String args[]){
        System.out.println("Enter the size of the array");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        Object arr[] = new Object[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter 1 to create subject Object 2 for Person 3 for complex ");
            int choice = si.nextInt();
            if(choice==1) {
                arr[i] = new Subject();
                ((Subject)arr[i]).init();
            } else if(choice==2) {
                arr[i] = new Person();
                ((Person)arr[i]).init();
            } else if (choice==3) {
                arr[i] = new Complex();
                ((Complex)arr[i]).init();
            }
        }
        for(int i=0;i<size;i++){
            if(arr[i] instanceof Subject)
            ((Subject)arr[i]).display();
            if(arr[i] instanceof Person)
            ((Person)arr[i]).display();
            if(arr[i] instanceof Complex)
            ((Complex)arr[i]).display();
        }
        
    }
}
