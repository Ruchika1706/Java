/* For user defined data types like Book Class here, the order has to be defined by the user for TreeSet to store Book data type. There are two ways to do the same
1. implement Comparable<Data_type> and override compareTo()
2. pass reference of Comparator in the constructor of TreeSet<DataType>
Advantage of 2 is that multiple criterias can be used for different instance of TreeSet for the data types.

Case 2 can be implemented either by having different classes implementing Comparator and we pass their reference in constructor of TreeSet or
by the concept of Anonymous Inner class as shown in this example
*/
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
class Book implements Comparable<Book>{
    private String author;
    private String name;
    private int price;
    //private ArrayList<String> review;
    public Book(){
        this.author = null;
        this.name = null;
        this.price = -1;
        //this.review = null;
    }
    public Book(String author, String name, int price){
        this.author = author;
        this.name = name;
        this.price = price;
        //this.review = new ArrayList<String>();
    }
    public Book(String author, String name){
        this.author = author;
        this.name = name;
        this.price = -1;
        //this.review = new ArrayList<String>();
    }
    public void setAuthor(String name){
        this.author = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public boolean equals(Object obj){
        //System.out.println("Inside equals method");
        if(this.name.equalsIgnoreCase(((Book)obj).getName()) && this.author.equalsIgnoreCase(((Book)obj).getAuthor())){
            return true;
            
        } 
        return false;
    }
    public int hashCode(){
        //System.out.println("Inside hashcode method");
        return (this.author).length() + (this.name).length();
    }
    /*
    public void setReview(String temp){
        this.review.add(temp);
    }
    public ArrayList<String> getReview(){
        return this.review;
    }
    */
    public int compareTo(Book temp){
        return (this.price > temp.price) ? 1:(this.price <temp.price ? -1 :0);
    }
    
    
}
class TreeSetBookCompare {
    public static void main(String args[]){
        TreeSet<Book> temp1 = new TreeSet<Book>(new Comparator<Book>(){
            public int compare(Book b1, Book b2){
             return (b1.getPrice() > b2.getPrice()) ? 1:(b1.getPrice() <b2.getPrice() ? -1 :0);   
            }
        }
        );
        TreeSet<Book> temp2 = new TreeSet<Book>(new Comparator<Book>(){
            public int compare(Book b1, Book b2){
                return (b1.getAuthor()).compareTo(b2.getAuthor());
            }
        }
        );
        Book b1 = new Book("Robin","ABC",3000);
        Book b2 = new Book("Robin123","PQR",200);
        Book b3 = new Book("Robin456","RST",300);
        Book b4 = new Book("Robin789","TUV",400);
        temp1.add(b1);
        temp1.add(b2);
        temp1.add(b3);
        temp1.add(b4);
        temp2.add(b1);
        temp2.add(b2);
        temp2.add(b3);
        temp2.add(b4);
        for(Book b: temp1){
            System.out.println(b.getPrice());
        }
        for(Book b: temp2){
            System.out.println(b.getAuthor());
        }
    }
}
