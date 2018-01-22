/* To check the number of times second string exists within the first string*/
import java.util.Scanner;
class StringSubCount {
    public static void main(String args[]){
        System.out.println("Enter the first string");
        Scanner si = new Scanner(System.in);
        String s1 = si.next();
        System.out.println("Enter the second string");
        String s2 = si.next();
        int count=0;
        int i;
        for(i=0;i<s1.length();i++) {
            if((s1.substring(i)).startsWith(s2)){
                count += 1;
            } 
        }
        System.out.println(count);
        
        
    }
}
