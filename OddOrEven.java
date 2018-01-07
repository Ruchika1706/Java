import java.util.Scanner;
class OddOrEven {
    public static void main(String args[]){
        int number;
        System.out.println("Enter a number:");
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        switch(number%2){
            case 0:
                System.out.println("Even number");
                break;
            default:
                System.out.println("Odd");
                break;
        }
    }
}