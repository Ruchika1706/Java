/*
1
11
121
1331
14641
1 5 10 10 5 1
sum[] =
 */

class PatternPrint4 {
    public static void main(String args[]){
        int sum[] = new int[6];
        int k =0;
        int test =0;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) {
                    System.out.print("1" + " ");
                    sum[i] = sum[k]+1;
                }
                else if(j==(i+1) || (j+1)== i){
                    System.out.print(test + " ");

                }
                else {
                    System.out.print("");
                }
            }
            System.out.println();
        }

    }
}
/*
a[i][j] = a[i-1][j] + a[i-1][j-1];
except for j=0 and j=i
 */