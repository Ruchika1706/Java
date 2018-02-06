import java.util.Scanner;
class StringBufferUsage {
    public static void main(String args[]){
        System.out.println("Enter the string where you want to replace");
        Scanner si = new Scanner(System.in);
        String input = si.nextLine();
        System.out.println("Enter the word which is found should be replaced by reverse");
        String word = si.next();
        StringBuffer next = new StringBuffer(word);
        next.reverse();
        StringBuffer output = new StringBuffer("");
        String arr[] = input.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(word)){
                output.append(next);
            } else {
                output.append(arr[i]);
            }
            output.append(" ");
        }
        input = output.toString();
        System.out.println(input);

    }
}