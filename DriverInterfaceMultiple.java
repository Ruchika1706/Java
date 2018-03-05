import java.util.Scanner;
interface CarDesign {
    void setNoSeats(int seats);
    int getNoSeats();
    public String toString();
}
interface GasDesign extends CarDesign {
    public void setFuelCapacity(int cap);
    public int getFuelCapacity();
}
interface ElectricDesign extends CarDesign {
    public void setBatteryPower(int pow);
    public int getBatteryPower();
}
class GasCar implements GasDesign{
    int seats;
    int fuelCapacity;
    public void setNoSeats(int seats){
        this.seats = seats;
    }
    public int getNoSeats(){
        return this.seats;
    }
    public void setFuelCapacity(int cap){
        this.fuelCapacity = cap;
    }
    public int getFuelCapacity(){
        return this.fuelCapacity;
    }
    public String toString(){
        return "Seats:" + this.seats + "fuelCapacityr" + this.fuelCapacity;
    }
    
}
class ElectricCar implements ElectricDesign{
    int seats;
    int batteryPower;
    public void setNoSeats(int seats){
        this.seats = seats;
    }
    public int getNoSeats(){
        return this.seats;
    }
    public void setBatteryPower(int pow){
        this.batteryPower = pow;
    }
    public int getBatteryPower(){
        return this.batteryPower;
    }
    /*public String toString(){
        return "Seats:" + this.seats + "Battery Power" + this.batteryPower;
    }*/
    
}
class HybridCar implements GasDesign,ElectricDesign{
    int seats;
    int fuelCapacity;
    int batteryPower;
    public void setNoSeats(int seats){
        this.seats = seats;
    }
    public int getNoSeats(){
        return this.seats;
    }
    public void setBatteryPower(int pow){
        this.batteryPower = pow;
    }
    public int getBatteryPower(){
        return this.batteryPower;
    }
    public void setFuelCapacity(int cap){
        this.fuelCapacity = cap;
    }
    public int getFuelCapacity(){
        return this.fuelCapacity;
    }
    public String toString(){
        return "Seats:" + this.seats + "fuelCapacityr" + this.fuelCapacity + "Battery Power:" + this.batteryPower;
    }
}
class DriverInterfaceMultiple {
    public static void main(String args[]){
        System.out.println("Enter the number of elements in the array");
        int size;
        Scanner si = new Scanner(System.in);
        size = si.nextInt();
        CarDesign arr[] = new CarDesign[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter 1 for Gas 2 Electric 3 for HYbrid car");
            int choice = si.nextInt();
            if(choice==1){
                arr[i] = new GasCar();
                int seats;
                int fuelCap;
                System.out.println("Enter the number of seats");
                seats = si.nextInt();
                System.out.println("Enter the fuel cap");
                fuelCap = si.nextInt();
                arr[i].setNoSeats(seats);
                ((GasCar)arr[i]).setFuelCapacity(fuelCap);
            } else if(choice==2){
                arr[i] = new ElectricCar();
                int seats;
                int pow;
                System.out.println("Enter the number of seats");
                seats = si.nextInt();
                System.out.println("Enter the battery power");
                pow = si.nextInt();
                arr[i].setNoSeats(seats);
                ((ElectricCar)arr[i]).setBatteryPower(pow);
            } else if(choice==3){
                arr[i] = new HybridCar();
                int seats;
                int pow;
                int fuelCap;
                System.out.println("Enter the number of seats");
                seats = si.nextInt();
                System.out.println("Enter the battery power");
                pow = si.nextInt();
                System.out.println("Enter the fuel cap");
                fuelCap = si.nextInt();
                arr[i].setNoSeats(seats);
                ((HybridCar)arr[i]).setBatteryPower(pow);
                ((HybridCar)arr[i]).setFuelCapacity(fuelCap);
            }
        }
        for(int i=0;i<size;i++){
            //System.out.println(arr[i].getNoSeats());
            /*if(arr[i] instanceof GasCar){
                System.out.println("This is a GasCar");
                System.out.println((GasCar)arr[i]);
            }
             if(arr[i] instanceof ElectricCar){
                System.out.println("this is an ElectricCar");
                System.out.println((ElectricCar)arr[i]);
             }
             if(arr[i] instanceof HybridCar){
                 System.out.println("this is an Hybrid Car");
             }*/
             System.out.println(arr[i]);
        }
    }
    
}