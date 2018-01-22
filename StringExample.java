import java.util.Scanner;
class StringExample {
    public static void main(String args[]){
        String s;
        System.out.println("Enter a String");
        Scanner si = new Scanner(System.in);
         // Allows you to take a String without spaces
        s = si.next();
        // Allows you to take a String with spaces
        s = si.nextLine();
        System.out.println(s);
    }
}
