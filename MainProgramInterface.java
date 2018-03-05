import java.util.Scanner;
//import java.util.Math;
interface Shape {
    public void setSide(int side1, int side2);
    public float calculateArea();
    public float calculateCircumference();
    public int getSide1();
    public int getSide2();
}
class Square implements Shape {
    private int side1;
    private int side2;
    public int getSide1(){
        return this.side1;
    }
    public int getSide2(){
        return this.side2;
    }
    public void setSide(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    public float calculateArea(){
        return this.getSide1()*this.getSide2();
    }
    public float calculateCircumference(){
        return 2*(this.getSide1()+this.getSide2());
    }
}
class Triangle implements Shape {
    int base;
    int height;
    public void setSide(int base, int height){
    this.base = base;
    this.height = height;
    }
    public int getSide1(){
        return this.base;
    }
    public int getSide2(){
        return this.height;
    }
    public float calculateArea(){
        return (this.getSide1()*this.getSide2())/2;
    }
    public float calculateCircumference(){
        double hyp;
        hyp = Math.pow((Math.pow(this.getSide1(),2)+Math.pow(this.getSide2(),2)),0.5);
        return (this.getSide1()+this.getSide2()+(float)hyp);
    }
}

class MainProgramInterface {
    public static void main(String args[]){
        System.out.println("Enter the number of elements in the Shape Array");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        Shape arr[] = new Shape[size];
        for(int i=0;i<size;i++){
            System.out.println("You want the shape to be square or triangle, enter 1 or 2 resp");
            int choice = si.nextInt();
            if(choice==1){
                System.out.println("Enter the side of square");
                int side = si.nextInt();
                arr[i] = new Square();
                arr[i].setSide(side,side);
            } else if(choice==2){
                System.out.println("Enter the base of right angle triangle");
                int base = si.nextInt();
                System.out.println("Enter the height of right angle triangle");
                int height = si.nextInt();
                arr[i] = new Triangle();
                arr[i].setSide(base,height);
            }
        }
        for(int i=0;i<size;i++){
            System.out.println("Side1:" + arr[i].getSide1());
            System.out.println("Side2:" + arr[i].getSide2());
            System.out.println("Area: "+ arr[i].calculateArea());
            System.out.println("Circumference:" + arr[i].calculateCircumference());
        }
    }
}