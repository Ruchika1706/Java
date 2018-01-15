import java.util.Scanner;
class MatrixArraySumInArray {
    public static void main(String args[]){
        System.out.println("Enter the number of rows");
        Scanner si = new Scanner(System.in);
        int rows = si.nextInt();
        int a[][] = new int[rows][];
        int b[][] = new int[rows][];
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
        for(int i=0;i<rows;i++){
            sum =0;
            b[i] = new int[(a[i].length)+1];
            int j;
            for(j=0;j<a[i].length;j++){
                b[i][j] = a[i][j];
                sum += a[i][j];
            }
            b[i][j] = sum;
        }
        a = b;
        for(int i=0;i<rows;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The length of a "+ a.length);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i].length);
        }
    }
}