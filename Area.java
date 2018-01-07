import java.util.Scanner;
class Area {
    public static void main(String args[]){
        int number;
        System.out.println("Enter 1 to calculate area of circle\n 2 to calculate area of triangle \n 3 to calculate area of rectangle");
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        double area;
        switch(number){
            case 1:
                int radius;
                System.out.println("Enter the radius of the circle");
                radius = si.nextInt();
                area = 3.14*radius*radius;
                System.out.println("The area of circle is " + area);
                break;
            case 2:
                int base,height;
                System.out.println("Enter the base of the triangle");
                base = si.nextInt();
                System.out.println("Enter the height of the triangle");
                height = si.nextInt();
                area = (double)(base*height)/2;
                System.out.println("The area of triangle is " + area);
                break;
            case 3:
                int length,breadth;
                System.out.println("Enter the length of the rectangle");
                length = si.nextInt();
                System.out.println("Enter the breadth of the rectangle");
                breadth = si.nextInt();
                area = length*breadth;
                System.out.println("The area of rectangle is " + area);
                break;
            default:
                System.out.println("Invalid menu option");
                break;
        }

    }
}