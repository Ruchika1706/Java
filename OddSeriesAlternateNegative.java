import java.util.Scanner;
class OddSeriesAlternateNegative {
    public static void main(String args[]){
        int number;
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        int fact=1;
        int temp=-1;
        double sum=0;
        for(int i=1;i<=number;i=i+2){
            fact = fact*i;
            temp = temp*(-1);
            sum += temp*1.0/fact;
            fact = fact*(i+1);
        }
        System.out.println(sum);

    }
}