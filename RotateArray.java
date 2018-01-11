import java.util.Scanner;
class RotateArray {
    public static void main(String agrs[]){
        int number;
        System.out.println("Enter the number of elements in  array");
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        int a[] = new int[number];
        int temp[] = new int[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter the value");
            a[i]= si.nextInt();
        }
        System.out.println("Array before rotation");
        for(int i=0;i<number;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<number;i++){
            temp[(i+1)%(a.length)] = a[i];
        }
        a = temp;

        System.out.println("Array after rotation");
        for(int i=0;i<number;i++){
            System.out.println(a[i]);
        }
    }
}