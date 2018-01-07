import java.util.Scanner;
class SumOfSeries {
    public static void main(String args[]){
        int number;
        double sum=0;
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        for(int i=1;i<=number;i++){
            sum += 1/(double)i;
        }
        System.out.println(sum);
    }
}