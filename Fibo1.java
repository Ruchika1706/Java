import java.util.Scanner;
class Fibo1 {
    public static void main(String args[]) {
        int first = 0;
        int second = 1;
        int fibo;
        System.out.println("Enter the value of n for number of terms in Fibonaaci series");
        Scanner si = new Scanner(System.in);
        int number = si.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(first);
            fibo = first + second;
            first = second;
            second = fibo;
        }
    }
}
