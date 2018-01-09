import java.util.Scanner;
class FiboBetween {
    public static void main(String args[]){
        int first = 0;
        int second = 1;
        int fibo;
        System.out.println("Enter the value of a");
        Scanner si = new Scanner(System.in);
        int number1 = si.nextInt();
        System.out.println("Enter the value of b");
        int number2 = si.nextInt();
        for(int i=1;i<=number2;i++){
            if(i==1 && i >number1)
                System.out.println(first);
            else if(i==2 && i>=number1)
                System.out.println(second);
            else {
                fibo = first+second;
                if(fibo>=number1 && fibo<=number2)
                    System.out.println(fibo);
                first = second;
                second = fibo;
            }
        }
    }
}