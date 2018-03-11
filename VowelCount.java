/*Take a string input from user. Create a function which throws an exception for a consonant and thus count the number of vowels in the string*/
import java.util.Scanner;
class VowelCount {
    static int count=0;
    public static void main(String args[]){
        Scanner si = new Scanner(System.in);
        System.out.println("enter a string");
        String input = si.next();
        for(int i=0;i<input.length();i++){
            try{
                 VowelCount.countVowels(input.charAt(i));
            }
            catch(Exception e){
           // System.out.println(e);
            }
        }
        System.out.println("The number of vowels in string are " + count);
    }
    public static void countVowels(char ch) throws Exception{
    char temp=Character.toUpperCase(ch);
        if((temp=='A')|| (temp=='E')|| (temp=='I')|| (temp=='O')|| (temp=='U')){
            count = count+1;
        } 
        else {
            throw new Exception("It is a consonant");
        }

        
    }
}
