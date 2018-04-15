//the first statement has be to the package statement. 
// All the classes in this file would become a part of this package mypac
//to compile this class use : javac -d . Complex.java
package mypac;
public class Complex {
	private int real;
	private int imaginary;
	public Complex() {
		System.out.println("Inside complex");
		this.real = this.imaginary = 0;
	}
	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	protected void display(){
		System.out.println(this.real + "+i" + this.imaginary);
	}
}
