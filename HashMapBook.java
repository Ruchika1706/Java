/* The user can add a review for the book(append to existing review if it exists) or get review for existing book */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
class Book {
    private String author;
    private String name;
    private int price;
    public Book(){
        this.author = null;
        this.name = null;
        this.price = -1;
    }
    public Book(String author, String name, int price){
        this.author = author;
        this.name = name;
        this.price = price;
    }
    public Book(String author, String name){
        this.author = author;
        this.name = name;
        this.price = -1;
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
    /*
    equals otherwise compares memory references of Objects, we are overriding to compare for duplicate values
    */
    public boolean equals(Object obj){
        System.out.println("Inside equals method");
        if(this.name.equalsIgnoreCase(((Book)obj).getName()) && this.author.equalsIgnoreCase(((Book)obj).getAuthor())){
            return true;
            
        } 
        return false;
    }
    /* Notice the name of the method carefully hashCode(), while overriding function signature should be same*/
    public int hashCode(){
        System.out.println("Inside hashcode method");
        return (this.author).length() + (this.name).length();
    }
    
}
class HashMapBook {
    public static void main(String args[]){
        HashMap<Book,ArrayList<String>> h1= new HashMap<Book, ArrayList<String>>();
        while(true){
            System.out.println("Do you want to add a review or get existing reviews 1 to add 0 to read");
            Scanner si = new Scanner(System.in);
            int choice = si.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the name of the book");
                    String name = si.next();
                    System.out.println("Enter the author of the book");
                    String author = si.next();
                    System.out.println("Enter the review you want to give");
                    String review = si.next();
                    Book b1 = new Book(author, name);
                    if(h1.containsKey(b1)) {
                        ArrayList<String> t1 = h1.get(b1);
                        t1.add(review);
                        h1.put(b1,t1);
                    }
                    else {
                        ArrayList<String> t2 = new ArrayList<String>();
                        t2.add(review);
                        h1.put(b1,t2);
                    }
                    break;
                case 0:
                    System.out.println("Enter the name of the book");
                    String name1 = si.next();
                    System.out.println("Enter the author of the book");
                    String author1 = si.next();
                    Book b2 = new Book(author1, name1);
                    if(h1.containsKey(b2)) {
                        ArrayList<String> t3 = h1.get(b2);
                        for(int i=0;i<t3.size();i++)
                        System.out.print(t3.get(i) + " ");
                    }
                    else {
                        System.out.println("The review does not exist so far");
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.println("Do you want to continue 1 for yes 0 for no");
            int ch = si.nextInt();
            if(ch==0)
            break;
        }
        
        
    }
}
