import java.util.Scanner;
import java.util.InputMismatchException;
class ArrayException {
    public static void main(String args[]){
        System.out.println("Enter the size of the array");
        try {
            Scanner si = new Scanner(System.in);
            //si.nextLine();
            int size = si.nextInt();
            int arr[]= new int[size];
            for(int i=0;i<size;i++){
                System.out.println("Enter the value at index " + i);
                si.nextLine();
                arr[i] = si.nextInt();
            }
            System.out.println("Enter the index you would want to access the value at");
            int index = si.nextInt();
            System.out.println(arr[index]);
        }
        catch(InputMismatchException e){
            System.out.println("Input type not correct");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds");
        }
        catch(NullPointerException f){
            System.out.println("Null pointer exception caught here");
        }
        catch(Exception e){
            System.out.println("Some type of exception caucght here");
            System.out.println(e);
        }
    }
}