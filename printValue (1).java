import java.util.Scanner;
class PrintValue {
    public static void main(String args[]){
        Scanner si= new Scanner(System.in);
        int number = si.nextInt();
        System.out.println(number>=20&&number<=30?1:(number>30&&number<=40?2:(number>40&&number<=50?3:4)));
    }
}