/* Using HashMap from Collections class*/
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
class HashMapExample {
    public static void main(String args[]){
        HashMap<Integer,String> h1 = new HashMap<Integer,String>();
        Scanner si = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("Enter the employee id");
            int id = si.nextInt();
            System.out.println("Enter the employee name");
            String name = si.next();
            h1.put(id,name);
        }
	/* Following are the two ways to get and print only the keys of the HashMap*/
	/*Example 1*/
        Object arr[] = h1.keySet().toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        /*Example 2*/
        for(Integer i: h1.keySet()){
            System.out.println(i);
        }
	/* Print all the key values on separate lines, one on each line*/
        System.out.println(h1.entrySet());
	/* h1.entrySet() returns a Map.Entry which is a static nested interface in Map Interface*/
        for(Map.Entry<Integer,String> t: h1.entrySet()){
            System.out.println(t.getKey()+ " "+t.getValue()); /* using functions provided by this */
        }
       
        
        //Assuming 123 was entered
        //System.out.println(h1.get(123));
        //If the key does not exists, get() returns null
        //System.out.println(h1.get(1234));
        }
}
