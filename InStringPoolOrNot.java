import java.util.Scanner;
class InStringPoolOrNot {
    public static void main(String args[]){
        System.out.println("Enter a string");
        Scanner si = new Scanner(System.in);
        String test1 = si.next();
        System.out.println("Enter a string");
        String test2 = si.next();
        /* If the input given by the user is exactly same, test for it*/
        if(test1 == test2){
            System.out.println("In String pool");
        } else {
            System.out.println("Not In String pool");
        }
    }
}