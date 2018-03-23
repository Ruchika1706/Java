import java.util.Scanner;
class SumOfDigitsWhile {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        int num = si.nextInt();
        int rem,sum=0;
        while(num>0){
            rem = num%10;
            num = num/10;
            sum += rem;
        }
        System.out.println("Sum of digits is "+ sum);
    }
}