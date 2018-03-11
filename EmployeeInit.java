/* Do exception handling for scenarios when age is less than 17 and salary <3000*/
import java.util.Scanner;
class EmployeeData {
    private String name;
    private int age;
    private int salary;
    public EmployeeData(){
        this.name = null;
        this.age =0;
        this.salary =0;
    }
    public EmployeeData(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String toString(){
        return " " + this.name + " "+ this.age+ " "+ this.salary;
    }
    public void setData(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void getData()  {
        String name;
        int age;
        int salary;
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        name = si.next();
        System.out.println("Enter the age of the employee");
        age = si.nextInt();
        if(age<17){
            throw new RuntimeException("Age is less than 17, re-enter age");
        }
        System.out.println("Enter the salary of the employee");
        salary = si.nextInt();
        if(salary<30000){
            throw new RuntimeException("Salary is less than 30000, please re-enter");
        }
        this.setData(name,age,salary);
    }
}
class EmployeeInit {
    public static void main(String args[]){
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the number of Employees");
        int count = si.nextInt();
        EmployeeData ob[] = new EmployeeData[count];
        int flag=0;
        for(int i=0;i<count;i++){
            do{
                try{
                    ob[i] = new EmployeeData();
                    ob[i].getData();
                    flag=0;
                }
                catch(Exception e){
                    System.out.println(e);
                    flag =1;
                    //ob[i].getData(); //doing this way I was not catching exception thrown here again
                }
            }while(flag==1);
        }
         for(int i=0;i<count;i++){
             System.out.println(ob[i]);
         }
            
        
    }
}
