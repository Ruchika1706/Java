import java.io.IOException;
import java.util.Scanner;
class RemoveSpacesDiffversion {
    public static void main(String args[]) throws IOException{
        System.out.println("Enter the number of strings you want in array");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        //Use a separate scanner.
        Scanner sj = new Scanner(System.in);
        String arr[] = new String[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter String "+ i );
            arr[i] = sj.nextLine();
        }
        System.out.println("Strings you entered");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        /*First Way*/
        System.out.println("Strings after removing spaces");
        for(int i=0;i<size;i++){
            System.out.println(arr[i].trim());
        }
        /*Second Way*/
        System.out.println("Strings after removing spaces");
        for(int i=0;i<size;i++){
            arr[i] = arr[i].replaceAll("^\\s+|\\s+$","");
            System.out.println(arr[i]);
        }

    }
}