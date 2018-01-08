import java.util.Scanner;
class Power {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner si = new Scanner(System.in);
        int number = si.nextInt();
        System.out.println("Enter the power");
        int power = si.nextInt();
        int product=1;
        for(int i=1;i<=power;i++)
            product = product*number;
        System.out.println("The number "+number+ " raised to the power " + power+" is "+ product);

    }

}