import java.util.Scanner;
class BillCalculation {
    public static void main(String args[]){
        int units;
        double bill=0;
        System.out.println("Enter the number of units consumed:");
        Scanner si = new Scanner(System.in);
        units = si.nextInt();
        if(units <= 100 ) {
            bill = units*0.60;
        }
        else if (units > 100 && units <=300) {
            bill = 100*0.60 + (units-100)*0.80;
        }
        else if (units >300) {
            bill = 100*0.60 + 200*0.80 + (units-300)*0.90;
        }
        if (bill>=150)
            bill -= 0.1*bill;
            
        System.out.println("Bill is "+ bill);
        
        
    }
}