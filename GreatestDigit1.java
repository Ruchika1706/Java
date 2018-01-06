import java.util.Scanner;
class GreatestDigit1 {
    public static void main(String args[]){
        int number;
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        int digit1 = number%10;
        int digit2 = number/100;
        int digit3 = number/10%10;
        int x;
        System.out.println((x = (digit1 > digit2 ? digit1 : digit2))>digit3?x:digit3);
    }
}