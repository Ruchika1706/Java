import java.util.Scanner;
class EnhancedForLoopExample {
    public static void main(String args[]){
        String test[] = {"hihello", "byeHello","cyou","cyousoon"};
       // String sample[] = new String[test.length];
       System.out.println("byeHello".indexOf("hello"));
        for(String each: test){
            if(each.toLowercase().endsWith("hello")){
                int index = each.indexOf("hello");
                System.out.println("Enter the replacement string for hello");
                Scanner si = new Scanner(System.in);
                String x = si.next();
                each = each.replace("hello",x);
                System.out.println(each);
            }
            else {
                System.out.println(each);
            }
        }
    }
}