/* Custom Generics
1. How to have a code that can accept different types of datatypes?
*/
import java.util.ArrayList;
class ArrayManipulationGenerics<T> {
    private ArrayList<T> temp;
    public ArrayManipulationGenerics(){
        temp = new ArrayList<T>();
    }
    public void add(T item){
        this.temp.add(item);
    }
    public void print(){
       for(T t1: this.temp){
           System.out.println(t1);
       }
    }
    
}
class ArrayGenerics {
    public static void main(String args[]){
        ArrayManipulationGenerics<Integer> a1 = new ArrayManipulationGenerics<Integer>();
        ArrayManipulationGenerics<Double> a2 = new ArrayManipulationGenerics<Double>();
       a1.add(3);
       a2.add(3.5);
       a1.print();
       a2.print();
        
    }
}
