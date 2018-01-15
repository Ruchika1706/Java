import java.util.Scanner;

class MatrixSaddlePoint {
        public static void main(String args[]) {
            Scanner si = new Scanner(System.in);
            System.out.println("Enter the number of rows in matrix");
            int row = si.nextInt();
            System.out.println("Enter the number of rows in columns");
            int column = si.nextInt();
            int arr[][] = new int[row][column];
            int min[] = new int[row];
            int max[] = new int[column];
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr[i].length;j++){
                    System.out.println("Enter the value you want to enter");
                    arr[i][j] = si.nextInt();
                }
            }
            System.out.println("Matrix  you entered");
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+"");
                }
                System.out.println();
            }
            for(int i=0;i<arr.length;i++) {
                min[i] = arr[i][0];
                for(int j=0;j<(arr[i].length);j++){
                    if(arr[i][j]<min[i]) {
                        min[i] = arr[i][j];
                    }
                }
            }
            for(int i=0;i<column;i++) {
                max[i] = arr[0][i];
                for(int j=0;j<(arr.length);j++){
                    if(arr[j][i]>max[i]) {
                        max[i] = arr[j][i];
                    }
                }
            }
            /*
            for(int i=0;i<arr.length;i++) {
                System.out.println("Minimum:" + min[i]);

            }
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr[i].length;j++){
                    System.out.println("Maximum:" + max[j]);
                }
            }
            */
            int flag =0;
            for(int i=0;i<arr.length;i++) {
                int j;
                for(j=0;j<arr[i].length;j++){
                    if(min[i] == max[j]) {
                        flag = 1;
                        System.out.println("The matrix has a saddle point value " +" " +arr[i][j] + " at " + (i+1) +"row");
                        break;
                    }
                }
            }
            if(flag == 0) {
                System.out.println("The matrix does not have a saddle point " );
            }

        }
}