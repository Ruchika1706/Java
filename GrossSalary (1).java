import java.util.Scanner;
class GrossSalary {
    public static void main(String args[]){
        int salary;
        int bonus = 0;
        Scanner si = new Scanner(System.in);
        System.out.println("Enter your Salary:");
        salary = si.nextInt();
        if(salary < 5000)
            bonus = 200;
        System.out.println("Gross Salary :" + (salary + bonus));
    }
}