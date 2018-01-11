import java.util.Scanner;
class InsertInArray {
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
        int temp = -1;
        int i=0;
        for(i=0;i< (arr.length);i++){
            if(i == (pos-1)) {
                temp = arr[i];
                arr[i]  = num;
                i++;
                break;
            }
        }
        int j;
        for(j= (arr.length-1);j>i;j--){
            arr[j] = arr[j-1];
        }
        arr[j] = temp;
        for(i=0;i<(arr.length);i++){
            System.out.println(arr[i]);
        }
    }
}