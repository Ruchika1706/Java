import java.util.Scanner;
class MatrixTranspose {
    public static void main(String args[]) {
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the number of rows which is same as columns for a square matrix");
        int row = si.nextInt();
        int arr[][] = new int[row][row];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter the value you want to enter");
                arr[i][j] = si.nextInt();
            }
        }
        System.out.println("Square Matric you entered");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
        //Calculating Transpose of the Matrix
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<(arr[i].length);j++){
                int temp;
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transpose of the matric you entered");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +"");
            }
            System.out.println();
        }

    }
}