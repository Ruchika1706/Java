import java.util.Scanner;
class Divisibility {
    public static void main(String args[]) {
    int number;
    Scanner si = new Scanner(System.in);
    System.out.println("Enter a number:");
    number = si.nextInt();
    if (number%2==0)
        if(number%3==0)
            System.out.println("Number is divisible by both 2 and 3");
        else
            System.out.println("Number is divisible by 2 only");
    else
        if(number%3==0)
            System.out.println("Number is divisible by 3 only");
        else
            System.out.println("None");
    }
}