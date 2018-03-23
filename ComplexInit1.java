import java.util.Scanner;
class Complex {
    private int real;
    private int imaginary;
    Complex(){
        real = imaginary = 0;
    }
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex(Complex value){
        this.real = value.real;
        this.imaginary = value.imaginary;
    }
    public void setValues(){
        System.out.println("Enter the value for real part");
        Scanner si = new Scanner(System.in);
        real = si.nextInt();
        System.out.println("Enter the value for imaginary part");
        imaginary = si.nextInt();
    }
    public int getReal(){
        return real;
    }
    public int getImaginary(){
        return imaginary;
    }
    public void display(){
        System.out.println(this.real +" +i " + this.imaginary);
    }
}
class ComplexInit1 {
    public static void main(String args[]) {
        System.out.println("Enter the size of array for complex objects");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        Complex c[] = new Complex[size];
        for(int i=0;i<size;i++){
            System.out.println("Etner the value for real part");
            int real = si.nextInt();
            System.out.println("Etner the value for Imaginary part");
            int imag = si.nextInt();
            c[i] = new Complex(real,imag);
        }
        Complex test = new Complex(c[0]);
        test.display();
    }
}