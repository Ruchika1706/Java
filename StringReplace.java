import java.util.Scanner;
class StringReplace {
    public static void main(String args[]){
        String test = "hello hi bye hello hel";
        test = test.replaceAll("hello","bye");
        System.out.println(test);
        
    }
}