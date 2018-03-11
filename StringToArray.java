/* Convert a string to a character array*/
import java.util.Scanner;
class StringToArray {
    public static void main(String args[]){
        System.out.println("Enter a string");
        Scanner si = new Scanner(System.in);
        String test = si.nextLine();
        /* Split with regular expression as empty string*/
        String array[] = test.split(" ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
