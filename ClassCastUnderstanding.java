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
interface Foo {}
class Alpha implements Foo {}
class Beta extends Alpha {}
class Delta extends Beta {}
class Building {}
class Barn extends Building {}
class Drinks{}
class Mocktails extends Drinks{}
class Cocktails extends Drinks{}
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
		   obj2 = obj1; //this will have compile time error, incompatiable type. If A and B were not related all together, compiler issue incovertible type error
		 */
		obj2 = (B)obj1; // to prevent the above issue. Now compile time issue gone

		A p = new A();
		B q;
		/*
		   q = (B)p; // this will compile fine but will cause ClassCastException at run time.
		 */





		Beta x = new Beta();
		Alpha a = x; // no problem here base class reference can point to derieved class object memory location
		/*
		   Foo f = (Delta)x; // class cast exception, x is base class object, we can;t cast it to derieved class. Beta can't be casted to Delta
		 */
		Foo temp = (Alpha)x; // it should be fine , we can cast derived class object to base class type.
		Foo f1 = (Beta)(Alpha)x; // this should work also



		Building build1 = new Building(); // works ok
		Barn barn1 = new Barn(); // works ok
		//Barn barn2 = (Barn) build1;  // class cast exception 
		Object objp = (Object) build1; // works fine, object base class of all classes, base class reference can point to derived class
		/*
		String str1 = (String) build1; // no relation between Building and String, Compilation Error, inconvertible types
		*/
		Building build2 = (Building) barn1; // works fine, object base class of all classes, base class reference can point to derived class


		Drinks drink = new Drinks();
		Mocktails mocktail = new Mocktails();
		Cocktails cocktail = new Cocktails();
		Drinks dm = new Mocktails();
		Drinks p4 = new Cocktails();
		drink = mocktail; // works fine, base class reference can point to derived class
		mocktail = (Mocktails)dm; // works fine. Correct typecasting, and dm actually points to memory location having Mocktail object
		/*
		mocktail = cocktail; // no relation error. not correct. Compilation error. Incompatible types
		*/
		//cocktail = (Cocktails)dm;// Drinks can't be cast to Cocktail, ClassCastException
		/* Compilation Issue, Incompatible types
		cocktail = dm; 
		*/


	}
}	
