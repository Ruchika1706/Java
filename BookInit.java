import java.util.Collections;
import java.util.Vector;
import java.util.Comparator;
/* Implement Comparable and override compareTo function to sort on that attribute*/
class Book implements Comparable<Book>{
    String name;
    String author;
    int price;
    Book(){
        this.name = this.author = null;
        this.price =0;
    }
    Book(String name,String author,int price){
        this.name = new String(name);
        this.author = new String(author);
        this.price =price;
    }
    int getPrice(){
        return this.price;
    }
    /*
    This is what is to be done when you write implements Comparable
    public int compareTo(Object obj){
        /*if(this.getPrice()>((Book)obj).getPrice()){
            return 1;
        } else if(this.getPrice() < ((Book)obj).getPrice()){
            return -1;
        } 
        return 0;
        
        if(this.getPrice()>obj.getPrice()){
            return 1;
        } else if(this.getPrice() < obj.getPrice()){
            return -1;
        } 
        return 0;
        
        if( obj instanceof Book){
            Book temp = (Book)obj;
            return ((Integer)this.getPrice()).compareTo((Integer)temp.getPrice());
        }
        return -1;
        
    }*/
    
    public int compareTo(Book obj){
        Book temp = (Book)obj;
        return (-1)*((Integer)this.getPrice()).compareTo((Integer)temp.getPrice());
    }
    public String toString(){
        return this.name + " " + this.price;
    }
    public String getName(){
        return this.name;
    }
}
/* Implement Comparator , override compare function for the oattribute you want to compare*/
class BookPriceComparator implements Comparator<Book> {
    public int compare(Book ob1, Book ob2){
        return ob1.getPrice()<ob2.getPrice()?-1:(ob1.getPrice()==ob2.getPrice()?0:1);
    }
}
class BookNameComparator implements Comparator<Book>{
     public int compare(Book ob1, Book ob2){
         return ((String)ob1.getName()).compareTo((String)ob2.getName());
     }
    
}
class BookInit{
    public static void main(String args[]){
        Vector<Book> vv = new Vector<Book>();
        Book b1 = new Book("ABC","PQR",100);
        Book b2 = new Book("DEF","PQR",300);
        Book b3 = new Book("GHI","PQR",50);
        vv.add(b1);
        vv.add(b2);
        vv.add(b3);
        System.out.println("Before Sort");
         for(int i=0;i<vv.size();i++){
            System.out.println(vv.elementAt(i));
        }
        Collections.sort(vv, new BookPriceComparator());
        System.out.println("After Sort");
        for(int i=0;i<vv.size();i++){
            System.out.println(vv.elementAt(i));
        }
         Collections.sort(vv, new BookNameComparator());
          System.out.println("After Sort");
        for(int i=0;i<vv.size();i++){
            System.out.println(vv.elementAt(i));
        }
    }
}