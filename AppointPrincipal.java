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
       System.out.println("Person object created"); 
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
    public Staff(int experience){
        this.experience = experience;
       System.out.println("staff object created"); 
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
       super(15);
       System.out.println("Supervisor object created"); 
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
class AppointPrincipal {
    public static void main(String args[]){
        System.out.println("Enter the number of supervisors");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        Supervisor obj[] = new Supervisor[size];
        for(int i=0;i<size;i++) {
            obj[i] = new Supervisor();
            //obj[i].init();
        }
        for(int i=0;i<size;i++) {
            obj[i].display();
        }
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