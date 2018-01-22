/* Usage of equals and equalsIgnoreCase function of String class*/
import java.util.Scanner;
class StringEquals {
    public static void main(String args[]){
        System.out.println("Enter the first string");
        Scanner si = new Scanner(System.in);
        String s1 = si.next();
        System.out.println("Enter the second string");
        String s2 = si.next();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    
        
    }
}
