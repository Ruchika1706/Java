import java.util.Scanner;
class SumElementsArray {
    public static void main(String args[]){
        System.out.println("Enter the size of the array");
        Scanner si = new Scanner(System.in);
        int number = si.nextInt();
        int arr[] = new int[number];
        for(int i=0;i<number;i++)
        {
            System.out.println("Enter the value to be stored in array");
            arr[i] = si.nextInt();
        }
        int sum=0;
        for(int i=0;i<number;i++)
        {
            sum += arr[i];
        }
        int temp[] = new int[arr.length+1];
        temp[temp.length-1] = sum;
        for(int i=0;i<number;i++)
        {
            temp[i] = arr[i];
        }
        arr = temp;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            
        }
        
        
    }
}