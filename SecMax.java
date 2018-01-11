import java.util.Scanner;
class SecMax {
    public static void main(String args[]) {
        System.out.println("Enter the size of the array");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " value");
            arr[i] = si.nextInt();
        }
        System.out.println("Array you entered ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        int max = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < size ; i++) {
            if(arr[i] == max) {
                continue;
            }
            else {
                max2 = arr[i];
                break;
            }
        }
        for (int i = 0; i < size ; i++) {
            if (arr[i] == max) {
                continue;
            } else if (arr[i] >= max2) {
                max2 = arr[i];
            }
        }
        System.out.println("Second maximum is "+ max2);
    }
}