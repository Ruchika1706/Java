import java.util.Scanner;
class OddSeriesNTerms {
    public static void main(String args[]){
        int number;
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        int fact=1;
        int temp=-1;
        double sum=0;
        for(int i=1;number>=0;i=i+2){
            fact = fact*i;
            temp = temp*(-1);
            sum += temp*1.0/fact;
            fact = fact*(i+1);
            number = number-1;
        }
        System.out.println(sum);

    }
}