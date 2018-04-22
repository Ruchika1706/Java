/* In this program we learn about 
1. Generics <>, 
2. Meaning of <?> <? extends class> <? super class>
3. Usage of Iterator
Currently with the given code, it will cause a compilation error of the "Same Erasure"
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
class Animal {
    int no_of_legs;
    public Animal(int no) {
        this.no_of_legs = no;
    }
    public Animal() {
        this.no_of_legs = -1;
    }
    public void setLegs(int no){
        this.no_of_legs = no;
    }
    public int getLegs() {
        return this.no_of_legs;
    }
    public String toString(){
        return " " + this.no_of_legs;
    }
}
class Dog extends Animal {
    String breed;
    public Dog(int no, String breed){
        super(no);
        this.breed = new String(breed);
    }
    public Dog() {
        super();
        this.breed = null;
    }
    public void setBreed(String breed){
        this.breed = new String(breed);
    }
    public String getBreed(){
        return this.breed;
    }
    public String toString(){
        return this.breed;
    }
}
class Cat extends Animal {
    String eyeColor;
    public Cat() {
        super();
        this.eyeColor = null;
    }
    public Cat(int no, String color){
        super(no);
        this.eyeColor = new String(color);
    }
    public void setColor(String color){
        this.eyeColor = new String(color);
    }
    public String getColor(){
        return this.eyeColor;
    }
    public String toString(){
        return this.eyeColor;
    }
}
class DriverProgramGenerics {
     /* The takeList function given below can accept any arraylist of Type Cat or of a class that extends Cat, but you can't modify the content in this 
	function */
    //public static void takeList(ArrayList<? extends Cat> temp){
        /*for(Dog t: temp){
            System.out.println(t);
        }*/
        //Way 1 to print all the elements of the arraylist received
        /*
        Iterator<?> itr = temp.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        */
        //Way 2 to print all the elements of the arraylist received
        /*
        for(Object t:temp.toArray()){
            System.out.println(t);
        }
        */
       // temp.add(new Dog()); // you can't modify the received ArrayList, will cause compilation error
       /* This is for the case when you receive ArrayList<Animal>, and you want to check how many of these are Cats, Dogs, and Animals
       int countA = 0, countD=0, countC=0;
       for(Object t:temp.toArray()){
            if(t instanceof Cat){
                countC += 1;
            } 
        }
        System.out.println("Cat Count" + countC);
    }
    */
    /* IMPORTANT : It is important to understand that 
	ArrayList<Animal> or ArrayList <? super Dog> etx just care for the type of ArrayList the parameter can accept.
	It does not care what the ArrayList can store as a member*/
    public static void takeList(ArrayList<? super Dog> temp){
    int countA = 0, countD=0;
       for(Object t:temp.toArray()){
            if (t instanceof Dog){
                countD += 1;
            } else if (t instanceof Animal){
                countA += 1;
            }
        }
        System.out.println("Dog count" + countD);
        System.out.println("Animal count" + countA);
    }
    public static void take2(ArrayList<Integer> temp) {
        
    }
    public static void take2(ArrayList<String> temp) {
        
    }
    public static void main(String args[]){
        /*
        List<Animal> arr = new ArrayList<Animal>();
        arr.add(new Dog());
        takeList((ArrayList<Animal>)arr);
        */
        /*
        ArrayList<Animal> arr1 = new ArrayList<Animal>();
        arr1.add(new Dog(4,"breed1"));
        arr1.add(new Dog(4,"breed2"));
        arr1.add(new Cat(4,"grey"));
        arr1.add(new Cat(4,"black"));
        arr1.add(new Animal(4));
        ArrayList<Cat> arr2 = new ArrayList<Cat>();
        arr2.add(new Cat(4,"blue"));
        takeList(arr2);
        takeList(arr1);
        */
	/* Reasearch Question: Why does the below code cause a same Erasure Compilation issue */
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        arr3.add(3);
        arr3.add(4);
        ArrayList<String> arr4 = new ArrayList<String>();
        arr4.add("temp1");
        arr4.add("Temp2");
        take2(arr3);
        take2(arr4);
        //takeList(new ArrayList<String>());
        //List<Animal> arr1 = new ArrayList<Dog>();
    }
    
}
