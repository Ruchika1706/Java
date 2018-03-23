class A {
	int a = 10;
	public void get() {
		System.out.println("Hello");
	}
}
class B  extends A {
	int a = 20;
	public void get() {
		System.out.println("Bye");
	}
	public void display() {
		System.out.println("Display");
	}
}
class ClassCastUnderstanding {
	public static void main(String args[]) {
	A ob = new A();
	ob.get(); //Will print Hello
	B obj = new B();
	obj.get(); // will print Bye
	A ob1 = new B();
	ob1.get(); // will print Bye, dynamic run time polymorphism. function get() called but overrridden by B so Bye printed.
	System.out.println(ob1.a); // instance variable depend on decalred type and not on object stored, so output is 10
	// this will cause compile time error, as A's reference still can't access B's function.
//	ob1.display();
	A obj1 = new B();
	B obj2;
	/*
	obj2 = obj1; // this will have compile time error, incompatiable type
	*/
	obj2 = (B)obj1; // to prevent the above issue

	A p = new A();
	B q;
	q = (B)p; // this will compile fine but will cause ClassCastException at run time.
	}
}	
