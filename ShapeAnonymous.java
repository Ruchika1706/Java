import java.util.Scanner;
abstract class Shape {
    int side1;
    int side2;
    private double area;
    public Shape(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    public abstract double getArea();
    public int getSide1(){
        return this.side1;
    }
    public int getSide2(){
        return this.side2;
    }
}
class ShapeAnonymous {
    public static void main(String args[]){
        System.out.println("Enter 1 for square, 2 for rect 3 for triangle");
        Scanner si = new Scanner(System.in);
        final int choice = si.nextInt();
        switch(choice){
            case 1:
                //System.out.println(choice);
                System.out.println("Enter the square size dimensions");
                int s1 = si.nextInt();
                //
                boolean ans = new Shape(s1,s1){
                    public double getArea(){
                        System.out.println(choice);
                        return this.side1*this.side1;
                    }
                    
                    boolean isGreatShape(){
                        return this.getArea()>100?true:false;
                    }
                }.isGreatShape();
                System.out.println(ans);
                //System.out.println("Area is"+ ob1.getArea());
                break;
            case 2:
                System.out.println("Enter the rectangle length ");
                int s2 = si.nextInt();
                System.out.println("Enter the rectangle breadth ");
                int s3 = si.nextInt();
                Shape ob2 = new Shape(s2,s3){
                    public double getArea(){
                        return this.getSide1()*this.getSide2();
                    }
                };
                System.out.println("Area is"+ ob2.getArea());
                break;
            case 3:
                System.out.println("Enter the triangle base ");
                int s4 = si.nextInt();
                System.out.println("Enter the triangle height ");
                int s5 = si.nextInt();
                Shape ob3 = new Shape(s4,s5){
                    public double getArea(){
                        return (this.getSide1()*this.getSide2())/2;
                    }
                };
                System.out.println("Area is"+ ob3.getArea());
                break;
            default:
                System.out.println("Invalid Choice");
                System.exit(0);
            
            
        }
    }
}