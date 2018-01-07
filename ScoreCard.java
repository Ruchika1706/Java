import java.util.Scanner;
class ScoreCard {
    public static void main(String args[]){
        int marks;
        System.out.println("Enter your marks");
        Scanner si = new Scanner(System.in);
        marks = si.nextInt();
        if(marks<0)
            System.out.println("Invalid Input");
        else if(marks>100)
            System.out.println("Invalid Input");
        else if(marks>=0){
            if(marks<=39)
                System.out.println("Fail");
            if(marks>=40)
                if(marks<=59)
                    System.out.println("Second class");
                else if(marks >=60)
                    if (marks <=74)
                        System.out.println("First Class");
                    else if (marks>=75)
                        if(marks <=100)
                        System.out.println("Distinction");
        }
    }
}