import java.util.Scanner;
class Octal2 {
    public static void main(String args[]){
        System.out.println("Enter a number whose octal value you want to print");
        Scanner si = new Scanner(System.in);
        int number = si.nextInt();
        int rem;
        int temp = number;
        int count = 0;
        while(temp>0){
            temp = temp/10;
            count += 1;
        }
        int a[] = new int[count];
        temp = number;
        int i=0;
        while(temp>0){
            rem = temp%8;
            temp = temp/8;
            a[i++] = rem;
        }
        System.out.print("Octal Value is 0");
        for(i=count-1;i>=0;i--) {
            System.out.print(a[i]);
        }
    }
}
