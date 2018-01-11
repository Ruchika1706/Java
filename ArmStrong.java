import java.util.Scanner;
class ArmStrong {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner si = new Scanner(System.in);
        int number = si.nextInt();
        int no_of_digits=0;
        int temp = number;
        int sum=0;
        while(temp>0){
            temp = temp/10;
            no_of_digits += 1;
        }
        temp = number;
        int rem;
        while(temp>0)
        {
            rem = temp%10;
            temp = temp/10;
            /*Calculate rem to the power number of digit and add to the sum*/
            int product=1;
            for(int i=1;i<=no_of_digits;i++)
            {
                    product = product*rem;
            }
            sum += product;
        }
        if(sum==number)
        {
            System.out.println("It is an Armstrong number");
        }
        else
        {
            System.out.println("It is not an Armstrong number");
        }
    }
    
}