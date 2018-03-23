import java.util.Scanner;
import java.util.InputMismatchException;
class InvalidDataException extends Exception {
	String message;
	public InvalidDataException(){
		this.message = null;
	}
	public InvalidDataException(String message){
		this.message = message;
	}
	public String toString(){
		return this.message;
	}
}
class InvalidAgeException extends InvalidDataException {
	public InvalidAgeException(){
		super();
	}
	public InvalidAgeException(String message){
		super(message);
	}
	public String toString(){
		return super.toString();
	}

}
class InvalidMarksException extends InvalidDataException {
	public InvalidMarksException(){
		super();
	}
	public InvalidMarksException(String message){
		super(message);
	}
	public String toString(){
		return super.toString();
	}
}
class InvalidRollnoException extends InvalidDataException {
	public InvalidRollnoException(){
		super();
	}
	public InvalidRollnoException(String message){
		super(message);
	}
	public String toString(){
		return super.toString();
	}
}
class Student{
	String name;
	int age;
	int rollno;
	int marks[];
	final int MAX_SCORE=100;
	Student(){
		this.name = null;
		this.age = -1;
		this.rollno = -1;
		this.marks = null;
	}
	Student(String name, int age, int rollno){
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		int count;
		System.out.println("Enter the number of the subjects");
		Scanner si = new Scanner(System.in);
		count = si.nextInt();
		this.marks = new int[count];
		for(int i=0;i<count;i++){
			System.out.println("Enter the marks for " + (i+1) + "subject");
			this.marks[i] = si.nextInt();
		}
	}
       public void setData() throws InvalidDataException,InputMismatchException{
		System.out.println("Enter the name of the student");
		Scanner si = new Scanner(System.in);
		this.name = si.next();;
		System.out.println("Enter the age of the student");
		this.age = si.nextInt();
		if(this.age < 15) {
			throw new InvalidAgeException("Age must be >=15");
		}
		System.out.println("Enter the rollno of the student");
		this.rollno = si.nextInt();
		if(this.rollno < 0) {
			throw new InvalidRollnoException("Rollno can't be <0");
		}
		int count;
		System.out.println("Enter the number of the subjects");
		count = si.nextInt();
		if(count<0) {
			throw new InvalidDataException("No of subjects can't be less than 0");
		}
		this.marks = new int[count];
		for(int i=0;i<count;i++){
			System.out.println("Enter the marks for " + (i+1) + "su bject");
			this.marks[i] = si.nextInt();
			if(this.marks[i] < 0 || this.marks[i] > this.MAX_SCORE) {
			 throw new InvalidMarksException("Marks not in the correct range");
		}
		}
       }
       public String toString(){
		 System.out.print(this.name + " " + this.age + " " + this.rollno);
                for(int i=0;i<marks.length;i++){
			System.out.print(" "+ marks[i]+ " " );
		}
		System.out.println();
		return "";
	}
}
class StudentInitException{
	public static void main(String args[]){
	Scanner si = new Scanner(System.in);
	int flag=0;
	int count=0;
	Student s[]= null;;
	do{
		try {
			System.out.println("Enter the number of students");
			count = si.nextInt();
			s = new Student[count];
            for(int i=0;i<count;i++){
			  s[i] = new Student();
			  s[i].setData();	
			  flag=0;
		     }
		}
		catch(NegativeArraySizeException e){
			System.out.println("You can't have negative number of students, try again");
			flag=1;
		}
		catch(InputMismatchException e) {
			System.out.println("Roll no can't be Decimal value");
			flag =1;
		}
		catch(InvalidDataException e){
			System.out.println(e);
			flag=1;
		}
	}while(flag==1);
	for(int i=0;i<count;i++){
	        System.out.println(s[i]);
	}
	
}
}