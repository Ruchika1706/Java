/* Given a string "Hello" as input, print each character on a separate line*/
import java.util.Scanner;
class StringSeparateLine {
    public static void main(String args[]){
        System.out.println("Enter the first string");
        Scanner si = new Scanner(System.in);
        String s1 = si.next();
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }
    
        
    }
}
