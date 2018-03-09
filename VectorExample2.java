import java.util.Scanner;
import java.util.Vector;
class VectorExample2{
    public static void main(String args[]){
        //to store data of different data types in a vector, use Object class 
        Vector<Object> vv = new Vector<Object>();
        String input;
        do {
            Scanner si = new Scanner(System.in);
            System.out.println("Enter a string to enter");
            input = si.next();
            if(!input.equalsIgnoreCase("no")){
                System.out.println("Enter a number to store");
                Integer input_int = new Integer(si.nextInt());
                System.out.println("Enter a double to store");
                Double input_double = new Double(si.nextDouble());
                 vv.add(input);
                 vv.add(input_int);
                 vv.add(input_double);
            }
        }while(!input.equalsIgnoreCase("no"));
        /*
        for(int i=0;i<vv.size();i++)
        {
            if(vv.elementAt(i) instanceof String)
            System.out.println(vv.elementAt(i)+ " "+((String)vv.elementAt(i)).length());
        }*/
        /*Since vector is iterable, using for each version */
        for(Object i:vv){
             if(i instanceof String)
            System.out.println(i+ " "+((String)i).length());
        }
    }
}