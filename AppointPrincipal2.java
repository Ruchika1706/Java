/* Questions

modify the code to handle below criteria
1.) By default every supervisor name is "ABC" and experience is 20 years, so is the case for every person i.e. name is "ABC" by default
2.) For any staff, the name by default is ABC
3.) for supervisors created with a particular qualification, the experience by default is 10 years and so is for every staff.
 */
import java.util.Scanner;
class Person {
    private String name;
    private int age;
    public void init(){
        System.out.println("Enter the name of person");
        Scanner si = new Scanner(System.in);
        this.name = si.next();
        System.out.println("Enter the age of person");
        this.age = si.nextInt();
        
    }
    public Person(){
        this.name = "ABC";
       //System.out.println("Person object created");
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        //System.out.println("Person object created");
    }
    public void display(){
        System.out.print(this.name +" "+ this.age);
    }
    public int getPersonAge(){
        return this.age;
    }
}
class Staff extends Person {
    private int experience;
    public Staff(){
        super();
    }
    public Staff(int experience){
        super();
        this.experience = experience;
       //System.out.println("staff object created");
    }
    public void init(){
        super.init();
        System.out.println("Enter the experience years of person");
        Scanner si = new Scanner(System.in);
        this.experience = si.nextInt();
    }
    public void display(){
        super.display();
        System.out.print(" "+ this.experience);
    }
    public int getStaffExperience(){
        return this.experience;
    }
}
class Supervisor extends Staff {
    private String qualification;
    public Supervisor(){
       super(20);
       //System.out.println("Supervisor object created");
    }
    public Supervisor(String qualification){
        super(10);
        this.qualification = qualification;
    }
    public void init(){
        super.init();
        System.out.println("Enter the qualification of person UG or PG");
        Scanner si = new Scanner(System.in);
        this.qualification = si.next();
    }
    public void display(){
        super.display();
        System.out.println(" "+ this.qualification);
    }
    public String getQualification(){
        return this.qualification;
    }
    
}
class AppointPrincipal2 {
    public static void main(String args[]){
        System.out.println("Enter the number of supervisors");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        Supervisor obj[] = new Supervisor[size];
        // Case 1
        for(int i=0;i<size;i++) {

            obj[i] = new Supervisor();
            //obj[i].init();
        }
        for(int i=0;i<size;i++) {
            obj[i].display();
        }
        Person p1 = new Person();
        p1.display();
        /* Case 2
        Staff s1 = new Staff();
        s1.display();
        */
        /*  Case 3
        for(int i=0;i<size;i++) {

            obj[i] = new Supervisor("PG");
            //obj[i].init();
        } */
        /*
        System.out.println("The number of supervisors who can be principal are");
        int count =0;
        for(int i=0;i<size;i++) {
            if(obj[i].getQualification().equalsIgnoreCase("PG")&& obj[i].getStaffExperience()>15 && obj[i].getPersonAge()>50){
                count +=1;
            }
        }
        System.out.println(count);
        */
        
        
    }
}