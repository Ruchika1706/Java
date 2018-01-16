import java.util.Scanner;
class Complex {
    private int real;
    private int imaginary;
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
}
class ComplexInit {
    public static void main(String args[]) {
        Complex c1 = new Complex();
        c1.setValues();
        System.out.println(c1.getReal() + "+i" +c1.getImaginary());
        Complex c2 = new Complex();
        c2.setValues();
        System.out.println(c2.getReal() + "+i" +c2.getImaginary());
    }
}