//Array of strings, change those string that ends with hello to anything the user likes and display it
import java.util.Scanner;
class EnhancedForLoopExample {
    public static void main(String args[]){
        String test[] = {"hihello", "byeHello","cyou","cyousoon"};
       // String sample[] = new String[test.length];
       System.out.println("byeHello".indexOf("hello"));
        for(String each: test){
            if(each.toLowerCase().endsWith("hello")){
                System.out.println("The string we are working with is " + each);
		System.out.println("Enter the replacement string for hello");
                Scanner si = new Scanner(System.in);
                String x = si.next();
                each = each.toLowerCase().replace("hello",x);
            }
                System.out.println(each);
        }
    }
}
