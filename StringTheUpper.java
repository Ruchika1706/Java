/* for any given input string with spaces, string starting with word, captialize those words*/
import java.util.Scanner;
class StringTheUpper {
    public static void main(String args[]){
        String test = "Hello to themaster of the theworld";
        String arr[] = test.split(" ");
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
            if(arr[i].startsWith("the")){
                arr[i] = arr[i].toUpperCase();
            }
        }
        for(int i=0;i<arr.length;i++){
           // System.out.println(arr[i]);
        }
        String sample = "";
        for(int i=0;i<arr.length;i++){
            sample = sample +  arr[i] + " ";
        }
        System.out.println(sample);
        
    }
}