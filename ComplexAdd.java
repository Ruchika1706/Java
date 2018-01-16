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
    /*public  void add(Complex a, Complex b){
        real = a.real+b.real;
        imaginary = a.imaginary + b.imaginary;
    }*/
    
    // IDeally whenever you have to manilupate 2 objects
    // one has to call and the other should be passed as a parameter.
    
    public Complex add(Complex b) {
        Complex c = new Complex();
        // this is a constant reference which points to the calling object
        c.real = this.real+b.real ;
        c.imaginary =this.imaginary +b.imaginary ;
        return c;
        
    }
    public Complex greaterComplex(Complex b) {
        if (this.real > b.real){
            return this;
        } else if (b.real > this.real) {
            return b;
        }
        else if(this.imaginary > b.imaginary) {
            return this;
        }
        else {
            return b;
        }
    }
    public void displayComplex() {
        System.out.println(this.real + "+i" + this.imaginary);
    }
}   

class ComplexAdd {
    public static void main(String args[]) {
        Complex c1 = new Complex();
        c1.setValues();
        Complex c2 = new Complex();
        c2.setValues();
        /*
        Complex c3 = new Complex();
        c3.add(c1,c2);
        System.out.println(c3.getReal() + "+i" +c3.getImaginary());
        c3 = c1.add(c2);
        */
        (c1.greaterComplex(c2)).displayComplex();
        
    }
}