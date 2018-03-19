import java.util.Scanner;
class Complex {
    private int real;
    private int imaginary;
    Complex() {
        
    }
    // Non static block, also called Instance block, called once each object, followed by constructor call
    // code common to all constructors is written here.
    // non static variable initialization can happen here.
    {
        System.out.println("This is non static block ");
        //this.real = 6;
        //this.imaginary = 7;
    }
   // static block, called once when the class is first loaded.
    static {
        System.out.println("Inside static block of Complex");
    }
    Complex(int r1, int i1){
       //System.out.println("Inside Constructor");
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
    // when explicit call to System.gc() is made, this function is called and executed. Override this function of Object class
    protected void finalize() throws Throwable{
        System.out.println(this.real + "+i" + this.imaginary);
        try{
            //super.finalize();
            System.out.println("The above object is garbage collected");
        }
        catch(Throwable t){
            System.out.println(t);
        }
    }
}
class ComplexInitConstructorGC {
    static {
        System.out.println("Inside static block of ComplexInitGC");
    }
    public static void main(String args[]) throws Throwable {
        Complex a = new Complex();
        Complex b = new Complex(5,6);
        a = new Complex(3,4);
        {
            Complex c = new Complex(8,9);
            //a = new Complex(3,4);
        }
	//Explicitly calling Garbage collector. Destroys unused reference in opposite order of creation. gc() is a static method in System class. 
        System.gc();
        a.display();
        
        //System.gc();
        for(int i=10;i<13;i++){
            b = new Complex(i,i);
        }
        //System.out.println("Hi");
        //System.gc();
    }
}
