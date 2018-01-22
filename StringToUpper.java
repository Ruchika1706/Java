/*Captialize first letter of each word in a string entered by nextLine()*/
import java.util.Scanner;
class StringToUpper {
    public static void main(String args[]){
        System.out.println("Enter the first string");
        Scanner si = new Scanner(System.in);
        String s1 = si.nextLine();
        String s2 ="";
        int marker=0;
        for(int i=0;i<s1.length();i++){
            if(i==0){
                s2 = s2 + Character.toUpperCase(s1.charAt(i));
            }else if (s1.charAt(i)==32){
                marker = i;
                s2 = s2 + s1.charAt(i);
                continue;
            } else if (marker!=0) {
                s2 = s2+ Character.toUpperCase(s1.charAt(marker+1));
                marker = 0;
            } else {
                s2 = s2+ s1.charAt(i);
            }
        }
        s1 = s2;
        System.out.println(s1);
        
    }
}
