import java.util.Scanner;
class SumOfSeriesAlternate {
    public static void main(String args[]){
        int number;
        double sum=0;
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        int fact=1;
        double temp;
        for(int i = 1;i<=number;i=i+1){
            fact = fact*i;
            if(i%2==0)
              temp = (1/(double)(fact))*(-1);
            else
              temp = (1/(double)(fact));
            sum = sum+temp;
        }
        System.out.println(sum);
        
        
    }
}