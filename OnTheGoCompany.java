/*On The Go is a vehicle renting and selling company. Only some of the vehicle types they own can be rented.
A customer can choose from the vehicles it rents and they are billed based on the usage and vehicle type.
It rents both cycles and registered vehicles including Cars and Bikes. People wanting to rent cars can choose from Sedan or SUV.
It also owns Sports Cars but they are not on rent.It sells Cruisers and Sports Bike from which only Cruisers can be rented.

Its rent calculation process is as follows:


For cycle, rent is calculated on an hourly basis. Currently the hourly rate is set to Rs.50/hour.

For Sedan, the minimum rent is Rs 4000/day for a minimum of 300 km. Above that every kilometer is charged at Rs 13/km

For SUV,the minimum rent is Rs 5000/day for a minimum of 300km. Above that every kilometer is charged at Rs 15/km.
Also it has an additional maintenance fee of Rs. 500 upfront.

For Cruisers, they charge a fixed deposit of Rs 5000 and rent is Rs.900/day


Design the appropriate inheritance tree and write a program which takes as input the vehicle to rent and
other related parameters for the rent calculation and outputs the total amount to be paid.


Vehicle -> Available on Rent/NA on rent
Billing -> based on hour and vehicle type
Vehicle (Base Class) -> Cycle, Cars , Bikes, Cruisers
Cars as Base class for Sedan and SUV and sports car or have car model as an attribute to have sedan/SUV/sports.
Bikes as base class for Sports bike or have model as an attribute for bikes.
Have constructors, private/public members, methods static and non static,
method overloading.
boolean isRentable (true or false), attribute of Vehicle class that is inherited by all derived classes.
*/
import java.util.Scanner;
class Vehicle {
    protected boolean Rentable;
    protected int cost;
    public Vehicle(){
        this.Rentable = false;
        this.cost = -1;
    }
}
class Cycle extends Vehicle {
    public boolean isRentable(){
            super.Rentable = true;
            return super.Rentable;
    }
    public int calculateRent(int hours){
            super.cost = 50*hours;
            return super.cost;
    }
}
class Car extends Vehicle {
    //Model can be Sedan, SUV or Sports
    private String model;
    public Car(String model){
        this.model = model;
    }
    public boolean isRentable(){
        if(this.model.equalsIgnoreCase("sedan")||this.model.equalsIgnoreCase("SUV") ){
            super.Rentable = true;
            return super.Rentable;
        } else {
            super.Rentable = false;
            return super.Rentable;
        }
    }
    public int calculateRent(int days,int kms){
        if(this.model.equalsIgnoreCase("sedan")){
            if(days <=1 || kms <= 300){
                super.cost = 4000;
                return super.cost;
            } else {
                super.cost = (4000*days) + (kms-300)*13;
                return super.cost;
            }

        } else if (this.model.equalsIgnoreCase("SUV")) {
            if(days <=1 || kms <= 300){
                super.cost = 500+5000;
                return super.cost;
            } else {
                super.cost = 500 + (5000*days) + (kms-300)*15 ;
                return super.cost;
            }
        }
        return super.cost;
    }

}
class Cruiser extends Vehicle {
    public boolean isRentable(){
        super.Rentable = true;
        return super.Rentable;
    }
    public int calculateRent(int days){
        super.cost = 5000+(900*days);
        return super.cost;

    }
}
class Bike extends Vehicle {
    private String model;
    public Bike(String model){
        this.model = model;
    }
    public boolean isRentable(){
        if(this.model.equalsIgnoreCase("sports")){
            super.Rentable = false;
            return super.Rentable;
        }
        else {
            super.Rentable = true;
            return super.Rentable;
        }
    }
    public int calculateRent(int days){
        //self imposed calculation here , random values
        super.cost = 500+(90*days);
        return super.cost;
    }
}
class OnTheGoCompany {
    public static void main(String args[]){
        System.out.println("How many vehicles are you looking for");
        Scanner si = new Scanner(System.in);
        int count = si.nextInt();
        Vehicle arr[] = new Vehicle[count];
        for(int i=0;i<count;i++){
            System.out.println("What type of vehicle do you want to rent? 1. Cycle 2.Car 3. Cruiser 4.Bike");
            int choice = si.nextInt();
            switch(choice){
                case 1:
                    arr[i] = new Cycle();
                    System.out.println("For many hours do you want the cycle?");
                    int hours = si.nextInt();
                    if(((Cycle)arr[i]).isRentable()){
                        arr[i].cost = ((Cycle)arr[i]).calculateRent(hours);
                    }
                    break;
                case 2:
                    System.out.println("What model do you want Sedan SUV or Sports");
                    String model = si.next();
                    arr[i] = new Car(model);
                    if(((Car)arr[i]).isRentable()){
                        System.out.println("For many days do you want the car?");
                        int days = si.nextInt();
                        System.out.println("For many kms do you want the car?");
                        int kms = si.nextInt();
                        arr[i].cost = ((Car)arr[i]).calculateRent(days,kms);
                    } else {
                        System.out.println(" This type is not available on rent, choose another option");
                        continue;
                    }
                    break;
                case 3:
                    arr[i] = new Cruiser();
                    if(((Cruiser)arr[i]).isRentable()){
                        System.out.println("Enter the number of days for which you want to rent?");
                        int days = si.nextInt();
                        arr[i].cost = ((Cruiser)arr[i]).calculateRent(days);
                    }
                    break;
                case 4:
                    System.out.println("What bike model do you want Normal or Sports");
                    String model1 = si.next();
                    arr[i] = new Bike(model1);
                    if(((Bike)arr[i]).isRentable()){
                        System.out.println("For many days do you want the Bike?");
                        int days = si.nextInt();
                        arr[i].cost = ((Bike)arr[i]).calculateRent(days);
                    } else {
                        System.out.println(" This type is not available on rent, choose another option");
                        continue;
                    }
                    break;
                default:
                    System.out.println("We only have these options to choose from.Sorry for inconvenience");
                    break;
            }
        }
        for(int i=0;i<count;i++){
            if(arr[i] instanceof Car)
                System.out.println("It is a car and cost incurred is "+ arr[i].cost);
            if(arr[i] instanceof Bike)
                System.out.println("It is a bike and cost incurred is "+ arr[i].cost);
            if(arr[i] instanceof Cruiser)
                System.out.println("It is a cruiser and cost incurred is "+ arr[i].cost);
            if(arr[i] instanceof Cycle)
                System.out.println("It is a cycle and cost incurred is "+ arr[i].cost);
        }

    }
}