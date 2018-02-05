/*Captialize first letter of each word in a string entered by nextLine()*/
import java.util.Scanner;
class StringToCharArray {
    public static void main(String args[]){
        System.out.println("Enter the first string");
        Scanner si = new Scanner(System.in);
        String s1 = si.nextLine();
        String test="";
        char arr[] = s1.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i-1]==32){
                test+=Character.toUpperCase(arr[i]);
            } else {
                test+=arr[i];
            }
        }
        System.out.println(test);
    }
}