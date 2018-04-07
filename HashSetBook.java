/* Hash Set of Books, does not allow duplicate values
4 cases possible
1.) Overrride equals() and overrride hashCode()-> Duplicate books( books with same name and author) not allowed
2.) Do not over ride equals() but overrride hashCode() -> so equals of object class compare references, different obj diff references, duplicates allowed
3.) Override equals() but not hashCode() -> hashCode() uses memory addresses so maps objects to differenct buckets, duplicates allowed
4.) No overriding of any of these functions ->references compared, different objects, different references duplicates allowed
You can comment each/both one by one to check the above conclusion
*/
import java.util.HashSet;
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
    public boolean equals(Object obj){
        System.out.println("Inside equals method");
        if(this.name.equalsIgnoreCase(((Book)obj).getName()) && this.author.equalsIgnoreCase(((Book)obj).getAuthor())){
            return true;
            
        } 
        return false;
    }
    public int hashCode(){
        System.out.println("Inside hashcode method");
        return (this.author).length() + (this.name).length();
    }
    
    
}
class HashSetBook {
    public static void main(String args[]){
        HashSet<Book> hs = new HashSet<Book>();
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the number of books you want to enter");
        int count = si.nextInt();
        Book arr[] = new Book[count];
        for(int i=0;i<count;i++){
            System.out.println("Enter the name of the book");
            String name = si.next();
            System.out.println("Enter the name of author of the book");
            String author = si.next();
            System.out.println("Enter the price of the book");
            int price = si.nextInt();
            arr[i] = new Book(author, name, price);
            System.out.println(hs.add(arr[i]));
        }
        for(Book b:hs){
            System.out.println(b.getName() + " " + b.getAuthor());
            
        }
        
        
    }
}
