import java.util.Scanner;
class PrintSeriesTwoVariables {
    public static void main(String args[]){
        int number;
        System.out.println("Enter the number of terms whose sum you want to print for series 1/2 +3/4 +5/6");
        Scanner si = new Scanner(System.in);
        number = si.nextInt();
        double sum=0;
        for(int i=1;number>0;i=i+2){
            sum += (double)(i)/(i+1);
            number = number-1;
        }
        System.out.println(sum);
    }
}