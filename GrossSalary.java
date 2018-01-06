class GrossSalary {
    public static void main(String args[]){
        double salary = 40000;
        double bonus = 0;
        double grosssalary;
        bonus = salary < 50000 ? 40*salary/100:30*salary/100;
        grosssalary = salary + bonus;
        System.out.println("Bonus: " + bonus + " Gross Salary: " + grosssalary);
    }
}