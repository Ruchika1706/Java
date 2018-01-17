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
        test.seconds = (this.hours*3600+this.minutes*60+this.seconds) -(a.hours*3600+a.minutes*60+a.seconds);
        test.minutes = Math.abs(test.seconds/60);
        test.seconds = Math.abs(test.seconds%60);
        test.hours = Math.abs(test.minutes/60);
        test.minutes = Math.abs(test.minutes%60);
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
        first.display();
        second.display();
        third.display();
        int choice;
        do {
        System.out.println("Choose your option");
        System.out.println("Enter 1 if you want to calculate difference between the first two times");
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