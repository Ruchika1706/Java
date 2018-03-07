import java.util.Scanner;
class ExceptionExample {
    public static void main(String args[]){
        System.out.println("Enter a string");
        Scanner si = new Scanner(System.in);
        String number = si.next(); 
        try {
                Integer.parseInt(number);
                System.out.println("It is an integer");
        }
        catch(NumberFormatException e){
           // System.out.println("not an integer");
            try {
                Double.parseDouble(number);
                System.out.println("It is a double");
            }
            catch(NumberFormatException f){
                System.out.println("Neither Integer not double");
                //System.out.println(e);
            }
        }
    }
}