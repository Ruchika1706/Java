import java.util.Scanner;
class greaterInTwo {
    public static void main(String args[]) {
        int number;
        int greater;
        Scanner si = new Scanner(System.in);
        System.out.println("Etner a three digit number");
        number = si.nextInt();
        int digit1 = number%10;
        int digit2 = number/100;
        int digit3 = number/10%10;
        /*greater = ((number/10)>(number%10))?(number/10):(number%10);*/
        greater = digit1>digit2?(digit1>digit3?digit1:digit3):(digit2>digit3?digit2:digit3);
        System.out.println("Greater digit is " + greater);
        
    }
}