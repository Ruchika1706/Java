import java.util.Scanner;
class GCD {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        int num1 = si.nextInt();
        System.out.println("Enter another number");
        int num2 = si.nextInt();
        while(num1!=num2){
            if(num1>num2)
                num1=num1-num2;
            if(num2>num1)
                num2=num2-num1;
        }
        System.out.println("GCD is "+num1);
    }
}