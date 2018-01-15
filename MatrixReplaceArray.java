import java.util.Scanner;
class MatrixReplaceArray {
    public static void main(String args[]){
        System.out.println("Enter the number of rows");
        Scanner si = new Scanner(System.in);
        int rows = si.nextInt();
        int a[][] = new int[rows][];
        int b[] = {3,4,5};
        int sum_b=0;
        int sum=0;
        int columns;
        for(int i=0;i<rows;i++){
            System.out.println("Enter the number of columns");
            columns = si.nextInt();
            a[i] = new int[columns];
            for(int j=0;j<columns;j++){
                System.out.println("Enter the value");
                a[i][j] = si.nextInt();
            }
        }
        for(int i=0;i<b.length;i++){
            sum_b = sum_b +b[i];
        }
        
        for(int i=0;i<rows;i++){
            sum =0;
            for(int j=0;j<a[i].length;j++){
                sum += a[i][j];
            }
            if(sum == sum_b){
                a[i] = b;
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}