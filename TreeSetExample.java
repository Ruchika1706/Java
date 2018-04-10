/*TreeSet always stores the data values in sorted order. For primitive data types, it uses the compareTo() function overridden by them to compare the order. Here in this example String class implements Comparable thus overrides compareTo() and so this TreeSet is able to store the values in sorted order*/
import java.util.TreeSet;
class TreeSetExample {
    public static void main(String args[]){
        TreeSet<String> temp = new TreeSet<String>();
        temp.add("abc");
        temp.add("ruchika");
        temp.add("ABC");
        for(String each: temp){
            System.out.println(each);
        }
    }
}
