import java.util.InputMismatchException;
class CommandLine {
	public static void main(String args[]){
		if(args.length < 3 || args.length >3) {
			System.out.println("The number of arguments to run this program should be 3 only");
			System.out.println(args.length);
			System.out.println(args[2]);
			System.exit(1);
		}
		else {
			try {
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
				char ch = args[2].charAt(0);
				int c= -1;
				switch(ch){
					case '+':
    					c = a+b;
    					break;
					case '-':
    					c = a-b;
    					break;
					case '*':
    					c = a*b;
    					break;
					case '/':
    					c = a/b;
    					break;
					default:
					    System.out.println("Invalis operation, try again");
					    System.exit(1); 
					    break;
				}
				System.out.println("The output after operation is" + c);
					
			}
			catch(NumberFormatException e)
			{
				System.out.println("The output arguments does not seem to be in correct order. Correct Order: intger integer operation");
				System.out.println("Try again");
				System.out.println(e);
			}
			catch(InputMismatchException e)
			{
				System.out.println("The output arguments does not seem to be in correct order. Correct Order: intger integer operation");
				System.out.println("Try again");
				System.out.println(e);
			}
			catch(ArithmeticException e) {
				System.out.println("Division by zero not allowed");
				System.out.println(e);
			}
		}
	}
}
