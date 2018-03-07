import java.util.Scanner;
import java.util.InputMismatchException;
class StringException {
    public static void main(String args[]){
        Scanner si = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = si.next();
        int flag=0;
        do {
            System.out.println("Enter the index for which character to be print from the string");
            try {
                si.nextLine();
                int index  = si.nextInt();
                System.out.println(s.charAt(index));
                flag=1;
            }
            catch(StringIndexOutOfBoundsException e){
                System.out.println("Invalid index location, try again");
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input type, try again");
            }
        }while(flag==0);
    }
}