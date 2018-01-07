import java.util.Scanner;
class SumOfSeriesAlternate1 {
    public static void main(String args[]){
        int number;
        double sum=0;
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        int fact=1;
        int temp = -1;
        for(int i = 1;i<=number;i=i+1){
            fact = fact*i;
            temp = temp*-1;
            sum = sum+temp * 1.0/fact;
        }
        System.out.println(sum);
        
        
    }
}