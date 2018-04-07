/* Hash Set does not allow duplicate values. It internally uses HashMap, so if you override equals and hashcode function, those will be used internally. Add function returns a boolean value, false when the value already exists.
Very Important : For any class in Collections, to print values, you can use Enhanced For Loop */
import java.util.HashSet;
class HashSetExample {
    public static void main(String args[]){
     HashSet<Integer> hs = new HashSet<Integer>();
     System.out.println(hs.add(5));
     System.out.println(hs.add(6));
     System.out.println(hs.add(7));
     System.out.println(hs.add(5));
     for(Integer i: hs){
         System.out.println(i);
     }
    }
}
