import java.util.Scanner;
class ForLoop1 {
    public static void main(String args[]){
        int number;
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        number  = si.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(number +"*"+ i +"="+(number*i));
    }
}