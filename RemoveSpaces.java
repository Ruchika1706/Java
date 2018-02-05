import java.util.Scanner;
class RemoveSpaces {
    public static void main(String args[]){
        System.out.println("Enter the number of strings you want in array");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        String arr[] = new String[size];
        for(int i=0;i<size;i++){
            arr[i] = si.nextLine();
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