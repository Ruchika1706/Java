import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class RemoveSpacesBufferedReader {
    public static void main(String args[]) throws IOException{
        System.out.println("Enter the number of strings you want in array");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        String arr[] = new String[size];
        /*In Scanner class if we call nextLine() method after any one of the seven nextXXX() method
        then the nextLine() doesn’t not read values from console and cursor will not come into console it will skip that step. The nextXXX() methods are nextInt(), nextFloat(), nextByte(), nextShort(), nextDouble(), nextLong(), next().
         */
        /*In BufferReader class there is no such type of problem. This problem occurs only for Scanner class, due to nextXXX() methods ignore
        newline character and nextLine() only reads newline character. If we use one more call of nextLine() method between nextXXX() and nextLine(), then this problem will not occur because nextLine() will consume the newline character. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<size;i++){
            System.out.println("Enter String "+ i );
            arr[i] = br.readLine();
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