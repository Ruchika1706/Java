import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
class VectorExample3{
    public static void main(String args[]){
        Vector<Integer> vv = new Vector<Integer>();
        Integer i;
        String input;
        do {
            Scanner si = new Scanner(System.in);
            System.out.println("Enter an integer");
            i = new Integer(si.nextInt());
            System.out.println("Do you want to enter more strings ");
            input = si.next();
            vv.add(i);
        }while(!input.equalsIgnoreCase("no"));
        
       /* for(int j=0;j<vv.size();j++){
            Integer min = vv.elementAt(j);
            //System.out.println(min);
            int index= j;
            for(int k=j+1;k<vv.size();k++){
                if(vv.elementAt(k)<min){
                    min = vv.elementAt(k);
                    index =k;
                }
            }
             Swap elements at index j with index of min
            Integer temp;
            temp = vv.elementAt(j);
           // System.out.println("The value here is " + temp);
            vv.set(j,min);
            vv.set(index,temp);
        }*/
        
        Collections.sort(vv);
        
        System.out.println("After sorting");
        for(int x=0;x<vv.size();x++){
            System.out.println(vv.elementAt(x));
        }
        
            
    }
} 