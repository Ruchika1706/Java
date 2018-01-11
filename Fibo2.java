import java.util.Scanner;
class Fibo2 {
    public static void main(String args[]) {
        int first = 0;
        int second = 1;
        int fibo;
        System.out.println("Enter the value of a");
        Scanner si = new Scanner(System.in);
        int number1 = si.nextInt();
        System.out.println("Enter the value of b");
        int number2 = si.nextInt();
        for (int i = 1; i <= number2; i++) {
            if(first>=number1 && first<=number2)
                System.out.println(first);
            fibo = first + second;
            first = second;
            second = fibo;
        }
    }
}