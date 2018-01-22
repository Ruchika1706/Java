import java.util.Scanner;
class RootsQuadritic {
    public static void main(String args[]){
        int a,b,c;
        double d;
        System.out.println("Enter the value for a in the equation ax^2+ bx+c");
        Scanner si = new Scanner(System.in);
        a = si.nextInt();
        System.out.println("Enter the value for b in the equation ax^2+ bx+c");
        b = si.nextInt();
        System.out.println("Enter the value for c in the equation ax^2+ bx+c");
        c = si.nextInt();
        /* Calculation of D*/
        d = Math.sqrt(Math.pow(b,2)-4*a*c);
        /*
        System.out.println("D"+ d);
        */
        System.out.println("Root1 "+ (-b+d)/(2*a));
        System.out.println("Root2 "+ (-b-d)/(2*a));
        
    }
}