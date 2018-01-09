import java.util.Scanner;
class Octal {
    public static void main(String args[]){
        System.out.println("Enter a number whose octal value you want to print");
        Scanner si = new Scanner(System.in);
        int number = si.nextInt();
        int revnum=0;
        int rem;
        int octal=0;
        /* Save all remainders from top to bottom in a number*/
        while(number>0){
            rem = number%8;
            number = number/8;
            revnum = revnum*10+rem;
        }
        /*Reverse the saved number to get the actual octal form*/
        while(revnum>0)
        {
            rem = revnum%10;
            revnum = revnum/10;
            octal = octal*10+rem;

        }
        System.out.println("The Octal form of the given number is " + "0"+octal);
    }
}