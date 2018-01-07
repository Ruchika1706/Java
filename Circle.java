import java.util.Scanner;
class Circle {
        public static void main(String args[]) {
            Scanner si = new Scanner (System.in);
            System.out.println("Enter the value of radius: ");
                int radius;
                float area;
                float circumference;
                radius = si.nextInt();
                circumference = 2 * 3.14f * radius;
                area = 3.14f * radius * radius;
                System.out.println("The area of circle is: " + area);
                System.out.println("The circumference of circle is: " + circumference);
        }
}
