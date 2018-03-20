import java.util.Scanner;
class Person {
    private String name;
    private int age;
    private Address ar;
    public Person(String name, int age, String city, String country){
        this.name = name;
        this.age = age;
	//call to Inner class Constructor
        this.ar = new Address(city, country);
    }
    public String toString(){
	//Very nice way to do the toString() implementation: Remember this.
        return this.name + " " + this.age + " " + this.ar.toString();
    }
    private class Address {
        private String city;
        private String country;
        public Address(String city, String country){
            this.city = city;
            this.country = country;
        }
        public void setCity(String city){
            this.city = city;
        }
        public void setCountry(String country){
            this.country = country;
        }
        public String getCountry(){
            return this.country;
        }
        public void display(){
            System.out.println(this.city);
            System.out.println(this.country);
        }
        public String toString() {
            return this.city + " " + this.country;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
        this.ar.display();
        
    }
    //Print all those person whose country is same as the given country name
    public boolean isSameCountry(String country){
        if(this.ar.getCountry().equalsIgnoreCase(country)){
            return true;
            
        }
        return false;
    }
    
}
class PersonInit {
    public static void main(String args[]){
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the number of persons");
        int count = si.nextInt();
        Person arr[] = new Person[count];
        for(int i=0;i<count;i++){
            System.out.println("Enter the name of the person");
            String name = si.next();
            System.out.println("Enter the age of the Person");
            int age = si.nextInt();
            System.out.println("Enter the city of the Person");
            String city = si.next();
            System.out.println("Enter the country of the Person");
            String country = si.next();
            arr[i] = new Person(name, age, city, country);
        }
        for(int i=0;i<count;i++){
            if(arr[i].isSameCountry("India")) {
                System.out.println(arr[i]);
            }
        }
    }
}
