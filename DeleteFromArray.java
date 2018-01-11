import java.util.Scanner;
class DeleteFromArray {
    public static void main(String args[]){
        System.out.println("Enter the size of the array");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        int a[] = new int[size];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the values of the array");
            a[i] = si.nextInt();
        }
        
        System.out.println("Enter a value you want to delete from array");
        int num = si.nextInt();
        int temp = a.length;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==num){
                for(int j=i;j<temp-1;j++){
                    a[j] = a[j+1];
                }
                temp = temp-1;
                i--;
            }
        }
        for(int i=0;i<temp;i++){
            System.out.println(a[i]);
        }
        
    }
}