import java.util.Scanner;
class GrossSalary2 {
    public static void main(String args[]){
        int salary;
        double bonus = 0;
        Scanner si = new Scanner(System.in);
        System.out.println("Enter your Salary:");
        salary = si.nextInt();
        if(salary < 5000)
            bonus = (double)(20*salary)/100;
        else
            bonus = (double)(30*salary)/100;
        System.out.println(" Salary :" + salary + " Bonus: "+ bonus + " Gross Salary:" + (salary+bonus));
    }
}