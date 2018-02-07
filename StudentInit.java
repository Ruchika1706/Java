import java.util.Scanner;
class Student {
    private String name;
    private int rollno;
    // we do not initialize the size of array here, done in constructor.
    private int marks[];
    public Student(){
        this.name = null;
        this.rollno = 0;
        // Point of error, take care not to use [] again 
        this.marks = new int[5];
    }
    public Student(String name, int rollno,int[] marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = new int[5];
        for(int i=0;i<marks.length;i++){
            this.marks[i] = marks[i];
        }
    }
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Rollno: " + this.rollno);
         System.out.print("Marks ");
        for(int i=0;i<this.marks.length;i++){
            System.out.print(this.marks[i]+ " ");
        }
        
    }
    public boolean startsWithChar(char startChar){
        if(this.name.charAt(0) == startChar){
            return true;
        } 
        else {
            return false;
        }
    }
    //Usage of BubbleSort here
    //Making sort function a static function to be called using Class name with objects as parameters
    public static void sortName(Student temp[]){
        Student test;
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<=(temp.length-2);j++){
                if(temp[j].name.compareTo(temp[j+1].name)>0){
                    test = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = test;
                }
            }
        }
        
    }
}
class StudentInit {
    public static void main(String args[]){
        Scanner si = new Scanner(System.in);
        //Student test = new Student("abc",123,arr);
        //test.display();
        System.out.println("Enter the size of Student array");
        int size = si.nextInt();
        Student arr[] = new Student[size];
        String name;
        int rollno;
        int marks[] = new int[3];
        for(int i=0;i<size;i++){
            System.out.println("Enter the name of student");
            name = si.next();
            System.out.println("Enter the rollno");
            rollno = si.nextInt();
            for(int j=0;j<marks.length;j++) {
                System.out.println("Enter the marks");
                marks[j] = si.nextInt();
            }
            arr[i] = new Student(name,rollno,marks);
        }
        
        // I want the parameter to be char only, display students whose name starts with character h
        /*
        for(int i=0;i<size;i++){
            if(arr[i].startsWithChar('h')){
                arr[i].display();
            }
        }*/
        // sort the students according to their names 
        Student.sortName(arr);
        for(int i=0;i<size;i++){
                arr[i].display();
        }
        
    }
}