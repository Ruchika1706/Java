/* To check if a given string is alphabetically ahead of the other i.e. comes before in sequence*/
import java.util.Scanner;
class StringAlpha {
    public static void main(String args[]){
        System.out.println("Enter the first string");
        Scanner si = new Scanner(System.in);
        String s1 = si.next();
        System.out.println("Enter the second string");
        String s2 = si.next();
        System.out.println(s1.compareTo(s2));
        if(s1.compareTo(s2) < 0) {
            System.out.println(s1 + " is alphabetically ahead");
        } else if (s1.compareTo(s2) >0 ){
            System.out.println(s2 + " is alphabetically ahead");
        } else {
            System.out.println("Both strings" + s1 + "and" + s2+" are same");
        }
        
    }
}
