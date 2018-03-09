import java.util.Scanner;
import java.util.Vector;
class VectorExample{
    public static void main(String args[]){
        Vector<String> vv = new Vector<String>();
        String input;
        do {
            Scanner si = new Scanner(System.in);
            System.out.println("Enter a string to enter");
            input = si.next();
            if(!input.equalsIgnoreCase("no"))
            vv.add(input);
        }while(!input.equalsIgnoreCase("no"));
        for(int i=0;i<vv.size();i++)
        {
            System.out.println(vv.elementAt(i));
        }
    }
}