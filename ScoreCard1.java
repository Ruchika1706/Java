import java.util.Scanner;
class ScoreCard1 {
    public static void main(String args[]){
        int marks;
        System.out.println("Enter your marks");
        Scanner si = new Scanner(System.in);
        marks = si.nextInt();
        if(marks<0)
            System.out.println("Invalid Input");
        else if(marks>100)
            System.out.println("Invalid Input");
        else if(marks >=75)
            System.out.println("Distinction");
        else if(marks >=60)
            System.out.println("First Class");
        else if(marks>=40)
            System.out.println("Second class");
        else 
            System.out.println("Fail");
    }
}