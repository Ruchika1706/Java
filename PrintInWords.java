import java.util.Scanner;
class PrintInWords {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        int num = si.nextInt();
        int temp = num;
        int revnum=0;
        int rem1;
        while(temp>0){
            rem1 = temp%10;
            revnum = revnum*10+rem1;
            temp = temp/10;
        }
        //System.out.println(revnum);
        while (revnum > 0) {
            int rem = revnum % 10;
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
            }
            revnum = revnum / 10;
        }
    }
}

