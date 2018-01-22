/* To check is a string exists within another string*/
import java.util.Scanner;
class StringSub {
    public static void main(String args[]){
        System.out.println("Enter the first string");
        Scanner si = new Scanner(System.in);
        String s1 = si.next();
        System.out.println("Enter the second string");
        String s2 = si.next();
        /*First method check if s2 is present in s1*/
        /*if((s1.contains(s2))) {
            System.out.println(s2 +" is present in " + s1);
        }
        else {
            System.out.println(s2 +" is not present in " + s1);
        }*/
        /*Second Method*/
        int i;
        for(i=0;i<s1.length();i++) {
            //System.out.println("Substring is " + s1.substring(i));
            if((s1.substring(i)).startsWith(s2)){
                System.out.println(s2 + "is present in " + s1);
                break;
            } 
        }
        if(i== s1.length()){
            System.out.println(s2 + "is not present in " + s1);
        }
        
    }
}
