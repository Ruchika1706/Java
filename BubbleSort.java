import java.util.Scanner;
class BubbleSort {
    public static void main(String args[]){
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = si.nextInt();
        int arr[] = new int[size];
        int temp;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element of array");
            arr[i] = si.nextInt();
        }
        for(int i = 0;i<(arr.length-1);i++){
            for(int j=0;j<=(arr.length-2);j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println("Sorted array");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        
    }
}