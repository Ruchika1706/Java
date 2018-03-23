class A {
	static void fun() {
		System.out.println("Hi");
	}
}
class B extends A {
	static void fun() {
		System.out.println("Bye");
	}


}


class StaticFunctionShadow {
 public static void main(String args[]) {
	A ob = new B();
	ob.fun();// if both function static -> O/P Hi, if both non-static O/P Bye, if static/non-static in A, non-static/static respectively in B compile time issue
}
}
