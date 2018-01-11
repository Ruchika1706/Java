import java.util.Scanner;
class PrintInWords1 {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        int num = si.nextInt();
        int temp = num;
        int rem1 = 0;
        int count = 0;
        while(temp>0){
            rem1 = temp%10;
            temp = temp/10;
            count += 1;
        }
        int a[] = new int[count];
        temp = num;
        int i=0;
        while(temp>0){
            rem1 = temp%10;
            temp = temp/10;
            a[i++] = rem1;
        }
        //System.out.println(revnum);
        for(i=count-1;i>=0;i--) {
            int rem = a[i];
            switch (rem) {
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                case 0:
                    System.out.print("Zero ");
                    break;

            }
        }
    }
}
