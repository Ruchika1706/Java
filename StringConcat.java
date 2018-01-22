/* Ways to concatenate two strings and save it in the first string*/
import java.util.Scanner;
class StringConcat {
    public static void main(String args[]){
        System.out.println("Enter the first string");
        Scanner si = new Scanner(System.in);
        String s1 = si.next();
        System.out.println("Enter the second string");
        String s2 = si.next();
        /*
        s1 = s1+s2;
        */
        s1 = s1.concat(s2);
        System.out.println(s1);
        
        
    }
}
