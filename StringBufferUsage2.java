import java.util.Scanner;
class StringBufferUsage2 {
    public static void main(String args[]){
        System.out.println("Enter the string where you want to replace");
        Scanner si = new Scanner(System.in);
        String input = si.nextLine();
        System.out.println("Enter the word which is found should be replaced by reverse");
        String word = si.next();
        //Conversion of String object to Stringbuffer as given below
        StringBuffer next = new StringBuffer(word);
        next.reverse();
        StringBuffer output = new StringBuffer("");
        for(int i=0;i<input.length();){
            if(input.substring(i).startsWith(word)){
                output.append(next);
                i = i + word.length();
            } else {
                output.append(input.charAt(i));
                i = i+1;
            }
        }
        //Conversion of StringBuffer object to String Object
        input = output.toString();
        System.out.println(input);

    }
}