import java.util.Scanner;
class Between {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        int number;
        System.out.println("Enter a number:");
        number = s1.nextInt();
        //boolean result = number > 20 && number <30;
        //boolean result = (number^30) && (number^40)
        boolean result = !(number==30 || number==40); 
        System.out.println(result);
    }    
}