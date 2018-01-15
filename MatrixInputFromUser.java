import java.util.Scanner;
class MatrixInputFromUser {
    public static void main(String args[]){
        System.out.println("Enter the number of rows");
        Scanner si = new Scanner(System.in);
        int rows = si.nextInt();
        System.out.println("Enter the number of columns");
        int columns = si.nextInt();
        int a[][] = new int[rows][columns];
        int sum[] = new int[rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Enter the value");
                a[i][j] = si.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum[i] = sum[i]+a[i][j];
            }
            
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print(sum[i]);
            System.out.println();
        }
    }
}