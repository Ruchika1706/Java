import java.util.Scanner;
class ArithmeticOperation{
    public static void main(String args[]){
        char ch = '+';
        int number1, number2;
        System.out.println("Enter first number");
        Scanner si = new Scanner(System.in);
        number1 = si.nextInt();
        System.out.println("Enter second number");
        Scanner sj = new Scanner(System.in);
        number2 = sj.nextInt();
        switch(ch){
            case '+':
                System.out.println(number1 + "" + ch + number2 + "=" + (number1+number2));
                break;
            case '-':
                System.out.println(number1 + "-" + number2 + "=" + (number1-number2));
                break;
            case '*':
                System.out.println(number1 + "*" + number2 + "=" + (number1*number2));
                break;
            case '/':
                System.out.println(number1 + "/" + number2 + "=" + (number1/number2));
                break;
        }
    }
}