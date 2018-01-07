import java.util.Scanner;
class SumOfDigits {
    public static void main(String args[]) {
        int num1;
        int sum =0;
        int rem =0;
        System.out.println("Enter a two digit number: ");
        Scanner si = new Scanner (System.in);
        num1 = si.nextInt();
        rem = num1 % 10;
        num1 = num1 /10;
        sum = rem + num1;
        System.out.println("The sum of digits is " + sum);
    }
}