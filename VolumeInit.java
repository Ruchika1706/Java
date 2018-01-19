import java.util.Scanner;
class Volume {
    
    public double getVolume(int radius, int height){
        return  Math.PI*Math.pow(radius,2)*height;
    }
    public double getVolume(int radius, double height){
        return (1.0/3)*Math.PI*Math.pow(radius,2)*height;
    }
    public double getVolume(double radius){
        return (4.0/3)*Math.PI*Math.pow(radius,3);
    }
}
class VolumeInit {
    public static void main(String args[]){
        System.out.println("Enter 1 to calculate volume of sphere");
        System.out.println("Enter 2 to calculate volume of cylinder");
        System.out.println("Enter 2 to calculate volume of cone");
        Scanner si = new Scanner(System.in);
        int choice = si.nextInt();
        switch(choice){
            case 1:
                double radius;
                System.out.println("Enter radius of the sphere");
                radius = si.nextDouble();
                Volume sphere = new Volume();
                System.out.println("Volume of given Sphere is");
                System.out.println(sphere.getVolume(radius));
                break;
            case 2:
                int r1;
                int h1;
                System.out.println("Enter radius of the cylinder");
                r1 = si.nextInt();
                h1 = si.nextInt();
                Volume cylinder = new Volume();
                System.out.println("Volume of given Cylinder is");
                System.out.println(cylinder.getVolume(r1,h1));
                break;
            case 3:
                int r2;
                double h2;
                System.out.println("Enter radius of the cylinder");
                r2 = si.nextInt();
                h2 = si.nextDouble();
                Volume cone = new Volume();
                System.out.println("Volume of given Cylinder is");
                System.out.println(cone.getVolume(r2,h2));
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}