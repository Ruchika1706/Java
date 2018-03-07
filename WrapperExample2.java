import java.util.Scanner;
class WrapperExample2 {
    public static void main(String args[]){
        Scanner si = new Scanner(System.in);
        System.out.println("Enter a number in string format");
        String number = si.next();
        //Integer ob = new Integer(number);
        //To be understood
        //System.out.println(Integer.valueOf(ob));
        System.out.println(Integer.parseInt(number));
        
    }
}