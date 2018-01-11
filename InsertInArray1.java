import java.util.Scanner;
class InsertInArray1 {
    public static void main(String args[]){
        int arr[] = new int[6];
        Scanner si = new Scanner(System.in);
        for(int k=0;k<(arr.length-1);k++){
            System.out.println("Enter the number for the array");
            arr[k]= si.nextInt();
        }
        
        System.out.println("Enter the number you want to insert");
        int num = si.nextInt();
        System.out.println("Enter the position at which you want to insert, from 1 to "+ (arr.length));
        int pos = si.nextInt();
        int temp;
        int i=0;
        int j;
        for(j= (arr.length-1);j>=pos;j--){
                arr[j] = arr[j-1];
        }
        arr[j+1] = num;
        for(i=0;i<(arr.length);i++){
            System.out.println(arr[i]);
        }
    }
}