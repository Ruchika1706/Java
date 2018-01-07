import java.util.Scanner;
class ForLoop {
    public static void main(String args[]){
        int number;
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        number  = si.nextInt();
        for(int i=1;i<=number;i++)
            if(i%2==0)
            System.out.println(i);
    }
}