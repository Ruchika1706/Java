import java.util.Scanner;
class MatrixDynamic {
    public static void main(String args[]){
        System.out.println("Enter the number of rows");
        Scanner si = new Scanner(System.in);
        int rows = si.nextInt();
        int a[][] = new int[rows][];
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
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}