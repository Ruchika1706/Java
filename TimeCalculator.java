import java.util.Scanner;
class Time {
    private int hours;
    private int minutes;
    private int seconds;
    public void display() {
        System.out.println(this.hours +":" +this.minutes+":"+this.seconds);
    }
    public void init(){
        System.out.println("Enter the value of seconds");
        Scanner si = new Scanner(System.in);
        this.seconds = si.nextInt();
        if (this.seconds >=60) {
            this.minutes = (this.seconds/60);
            this.seconds -= (this.minutes*60);
        }
        System.out.println("Enter the value of minutes");
        this.minutes += si.nextInt();
        if (this.minutes >=60) {
            this.hours = (this.minutes/60);
            this.minutes -= (this.hours*60);
        }
        System.out.println("Enter the value of hours");
        this.hours += si.nextInt();
        if (this.hours > 24) {
            System.out.println("Number of hours should not spill more than 24 hours in a day");
            System.exit(1);
        }
    }
    public Time differenceTime(Time a) {
        Time test = new Time();
        test.hours = Math.abs(this.hours-a.hours);
        test.minutes = Math.abs(this.minutes-a.minutes);
        test.seconds = Math.abs(this.seconds-a.seconds);
        return test;
    }
    public Time greaterInTime(Time d) {
        if(this.hours > d.hours){
            return this;
        } else if (d.hours > this.hours) {
            return d;
        } else if(this.minutes > d.minutes) {
            return this;
        } else if(this.minutes < d.minutes) {
            return d;
        } else if(this.seconds > d.seconds) {
            return this;
        } else if(this.seconds < d.seconds) {
            return d;
        }
        return this;
    }
}


class TimeCalculator {
    public static void main(String args[]){
        Time first = new Time();
        Time second = new Time();
        Time third = new Time();
        first.init();
        second.init();
        third.init();
        int choice;
        do {
        System.out.println("Choose your option");
        System.out.println("Enter 1 if you want to calculate difference between two times");
        System.out.println("Enter 2 if you want to calculate greatest among the three times");
        System.out.println("Enter 3 if you want to display all the three times");
        Scanner si = new Scanner(System.in);
        choice = si.nextInt();
        switch(choice){
            case 1:
                (first.differenceTime(second)).display();
                break;
            case 2:
                (first.greaterInTime(second.greaterInTime(third))).display();
                break;
            case 3:
                first.display();
                second.display();
                third.display();
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }
        System.out.println("Enter 4 to continue to choose or enter any other number to exit");
        choice = si.nextInt();
        } while(choice==4);

    }
}