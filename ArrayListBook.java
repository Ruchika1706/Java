/* contains() in ArrayList internally uses equals(), so for user defined data types we can override the equals method to get the desired result*/
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
class Book {
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
    
}
class ArrayListBook {
    public static void main(String args[]){
        ArrayList<Book> arr = new ArrayList<Book>();
        Book b1 = new Book("Robin","ABC",150);
        Book b2 = new Book("Robin123","PQR",250);
        arr.add(b1);
        arr.add(b2);
        Scanner si = new Scanner(System.in);
        System.out.println("enter the name of the book you want to remove from list");
        String name = si.next();
        Book temp = new Book("Robin123",name);
        /*for(Book b:arr){
            if(b.getName().equals(name)){
                temp=b;
                break;
            }
        }*/
        /*After*/
        System.out.println(arr.contains(temp));
        arr.remove(temp);
        for(Book b:arr){
            System.out.println(b.getName());
        }
        //arr.remove(temp);
        
    }
}
