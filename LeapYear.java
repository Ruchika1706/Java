import java.util.Scanner;
class LeapYear{
    public static void main(String args[]){
        int number;
        System.out.println("Enter a year to check if it is leap year or not");
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        if((number%100 == 0 && number%400 == 0) || (number%100!=0  && number%4==0))
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");

    }
}