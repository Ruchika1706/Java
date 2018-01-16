import java.util.Scanner;
class MatrixMaxMinSwap {
    public static void main(String args[]){
        int a[][] = {{1,2,3,4},{5,6},{7,8,9}};
        int min = a[0][0];
        int max = a[0][0];
        int temp1=0;
        int temp2=0;
        System.out.println("Before");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>max){
                    max = a[i][j];
                    temp1 = i;
                } 
                else if (a[i][j] < min) {
                    min = a[i][j];
                    temp2 = i;
                }
            }
        }
        int temp[] = null;
        temp = a[temp1];
        a[temp1] = a[temp2];
        a[temp2] = temp;
        System.out.println("After");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
    }
}