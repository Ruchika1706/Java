import java.util.Scanner;
class PrimeOrNot1 {
    public static void main(String args[]){
        int number;
        Scanner si = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not");
        number = si.nextInt();
        int i;
        for(i=2;i<number;i++){
            if(number%i==0){
                break;
            }
        }
        if(i==number){
            System.out.println("prime number");
        }
        else {
            System.out.println("Not a prime number");
        }
    }
}