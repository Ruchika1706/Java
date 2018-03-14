import java.util.Scanner;
import java.util.InputMismatchException;
class ChainedExceptionExample {
        public static void main(String args[]){
            int a=0;
            Scanner si = new Scanner(System.in);
            
  
            
                try{
                    System.out.println("Enter the value for a");
                    a = si.nextInt();
                }
                catch(InputMismatchException e){
                   
                        throw new ArithmeticException();
                }
            
           
        }
}
