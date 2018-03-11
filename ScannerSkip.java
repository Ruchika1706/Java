import java.util.Scanner;
class ScannerSkip {
	public static void main(String args[]) {
	int a;
	String b;
	System.out.println("Enter a number");
	Scanner si = new Scanner(System.in);
	a = si.nextInt();
	si.skip("[\n]");
	System.out.println("Enter a String");
	b = si.nextLine();
	System.out.println(a);
	System.out.println(b);
	}
}
