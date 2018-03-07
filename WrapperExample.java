import java.util.Scanner;
class WrapperExample {
    public static void main(String args[]){
        Scanner si = new Scanner(System.in);
        int number = si.nextInt();
        Integer ob = new Integer(number);
        System.out.println(ob);
    }
}