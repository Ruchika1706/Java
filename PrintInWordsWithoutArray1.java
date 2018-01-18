
import java.util.Scanner;
class PrintInWordsWithoutArray1 {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        int num = si.nextInt();
        int temp = num;
        int rem = 0;
        int revnum = 0;
        int power= 1;
        while (temp > 0) {
            temp = temp / 10;
            power = power*10;
        }
        power = power/10;
        while(power>0){
            int quo = num/power;
            switch (quo) {
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                case 0:
                    System.out.print("Zero ");
                    break;

            }
            num = num%power;
            power = power/10;
        }
    }
}



