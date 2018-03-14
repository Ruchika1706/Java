import java.util.Scanner;
class Add1ToNumber {
    public static void main(String args[]){
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the number you want to add 1 to");
        int x = si.nextInt();
        int y = Add1ToNumber.addOne(x);
        System.out.println("After adding 1 to the number, output is " + y);
    }
    public static int addOne(int x){
        int m=1;
	/*find the bit place where the first zero is found, till then keep flipping the bits which are 1 to 0*/
        while((x & m)!=0){
		x = x^m;
		m = m<<1;
        }
	/*The bit place which is 0 is now found, flip it also to 1*/
	x = x^m;
	return x;
    }
}
