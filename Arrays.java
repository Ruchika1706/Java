import java.util.Scanner;
class Arrays {
    public static void main(String args[]){
        System.out.println("Enter the size of the array");
        Scanner si = new Scanner(System.in);
        int num = si.nextInt();
        int arr[] = new int[num];
        for(int i=1;i<=num;i++)
        {
            System.out.println("Enter the value you want to store");
            arr[i-1]= si.nextInt();
        }
        System.out.println("The values stored in array are");
        for(int i=0;i<num;i++)
        {
           System.out.println(arr[i]);
            
        }
    }
}