//Importing the class Complex inside the mypac package
import mypac.Complex;
//Once the class has been imported, fully qualified class name not required
class Test extends Complex{
	public Test() {
		super();
	}
	public void display() {
		super.display();
	}
	public static void main(String args[]) {
		Complex a =  new Complex();
		new Test().display();
		//Interseting fact: Protected members & member functions can be
		// accessed in a class that subclass this class in different 
		//package, but only by object of the derived class and not by
		// object of parent class.
		//a.display(); wont' work here, but the above line would work
		System.out.println("Hello World");
	}
}
