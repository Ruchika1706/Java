import java.util.Scanner;
class DivisibilityTest {
    public static void main(String args[]){
        int number;
        System.out.println("Enter a number to check divisibility");
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        if(number%2==0 && number%3==0)
            System.out.println("Divisible by both 2 and 3");
        else if(number%3==0)
            System.out.println("Divisible by  3");
        else if (number%2==0)
            System.out.println("Divisible by  2");
        else
            System.out.println("Not Divisible by both 2 and 3");

    }
}