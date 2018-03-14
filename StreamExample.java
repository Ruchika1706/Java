import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class StreamExample {
    public static void main(String args[]){
        //InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter a string");
            String str = br.readLine();
            //br.skip(1);
            System.out.println("Enter a character");
            int ch = br.read();
            System.out.println("Character ented is" + (char)ch);
            br.read();// to flush the stream
            System.out.println("Enter a double");
            String d = br.readLine();
            System.out.println("Integer is" + ch);
            System.out.println("Double is" + Double.parseDouble(d));
        }
        catch(IOException e){
            System.out.println("Input Output exception occured");
        }
    }
}
