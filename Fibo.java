import java.util.Scanner;
class Fibo {
    public static void main(String args[]){
        int first = 0;
        int second = 1;
        int fibo;
        System.out.println("Enter the value of n for number of terms in Fibonaaci series");
        Scanner si = new Scanner(System.in);
        int number = si.nextInt();
        for(int i=1;i<=number;i++){
            if(i==1)
                System.out.println(first);
            else if(i==2)
                System.out.println(second);
            else {
                fibo = first+second;
                System.out.println(fibo);
                first = second;
                second = fibo;
            }
        }
    }
}