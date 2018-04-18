/* To compile this class from proj3
javac -d proj1/classes proj1/src/mypac/Complex.java
To execute ( though main function not found error)
java -cp proj1/classes mypac.Complex
*/
package mypac;
public class Complex {
       private int real;
       private int imaginary;
       public Complex(int real, int ima) {
		this.real = real;
		this.imaginary = ima;
	}
       public Complex() {
		this.real = 0;
		this.imaginary = 0;
	}
	public String toString() {
		return this.real +  "+i" + this.imaginary;
	}
}
