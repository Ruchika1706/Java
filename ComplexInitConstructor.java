import java.util.Scanner;
class Complex {
    private int real;
    private int imaginary;
    Complex() {
        
    }
    Complex(int r1, int i1){
        this.real = r1;
        this.imaginary = i1;
    }
    public int getReal(){
        return real;
    }
    public int getImaginary(){
        return imaginary;
    }
    public void display(){
        System.out.println(this.real + " +i "+this.imaginary);
    }
    public Complex addComplex(Complex a){
        Complex temp = new Complex();
        temp.real = this.real +a.real;
        temp.imaginary = this.imaginary+a.imaginary;
        return temp;
    }
}
class ComplexInitConstructor {
    public static void main(String args[]) {
        System.out.println("Enter the number of complex objects you want to create");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        Complex c[] = new Complex[size];
        for(int i=0;i<size;i++){
            System.out.println("Which option do you want to create object using?");
            System.out.println("Enter 1 for default value");
            System.out.println("Enter 2 for input from user");
            System.out.println("Enter 3 for same value for real and imag");
            int choice = si.nextInt();
            if(choice == 1) {
                c[i] = new Complex(5,5);
            }else if(choice == 2) {
                int real,imag;
                System.out.println("Enter value for real");
                real = si.nextInt();
                 System.out.println("Enter value for imaginary");
                imag = si.nextInt();
                c[i] = new Complex(real,imag);
            } else if(choice == 3) {
                System.out.println("Enter value for real & imag");
                int real = si.nextInt();
                c[i] = new Complex(real,real);
            } else {
                System.out.println("Invalid option");
                }
            }
        for(int i=0;i<size;i++){
            c[i].display();
        }
        }
    }
