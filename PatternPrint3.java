/*
1
11
121
1331
14641
1 5 10 10 5 1
 */

class PatternPrint3 {
    public static void main(String args[]){
        int a[][] = new int[6][6];
        a[0][0] = 1;
        for(int i=1;i<=5;i++){
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i)
                    a[i][j] = 1;
                else {
                    a[i][j] = a[i-1][j]+a[i-1][j-1];
                }
            }
        }
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
a[i][j] = a[i-1][j] + a[i-1][j-1];
except for j=0 and j=i
 */