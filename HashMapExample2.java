/* Data entry operator is entering the data of the students in random order, student id followed by the marks in a test.
A student can have given any number of tests, create a data type to store such data*/
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
class HashMapExample2 {
    public static void main(String args[]){
        HashMap<Integer,ArrayList<Integer>> h1 = new HashMap<Integer,ArrayList<Integer>>();
        Scanner si = new Scanner(System.in);
        /*
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(3);
        temp.add(4);
        h1.put(123,temp);
        //h1.put(123,temp);
        System.out.println(h1);
        */
        while(true){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            System.out.println("Enter the ID for this student");
            int id = si.nextInt();
            System.out.println("Enter the marks of the student");
            int marks = si.nextInt();
            if(h1.containsKey(id)){
                ArrayList<Integer> y = h1.get(id);
                y.add(marks);
                h1.put(id,y);
                
            } else {
                temp.add(marks);
                h1.put(id,temp);
            }
            System.out.println("Do you want to enter more values 1 for yes 0 to no");
            int choice = si.nextInt();
            if(choice==0)
            break;
            
        }
        System.out.println(h1);
    }
}
