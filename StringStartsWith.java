import java.util.Scanner;
class StringStartsWith {
    public static void main(String args[]){
        System.out.println("Enter the size of array for the strings");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        String test[] = new String[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the string in the array");
            String str = si.next();
            test[i] = new String(str);
        }
        /*Array of strings you entered*/
        for(int i=0;i<size;i++){
            System.out.println(test[i]);
        }
         System.out.println("Enter a string you would want to find out");
         String find = si.next();
         int count =0;
         for(int j=0;j<size;j++){
             if(test[j].startsWith(find)){
                 count+=1;
             }
         }
         System.out.println("The string you entered occurs the following times in beginning in given array");
         System.out.println(count);
        
    }
}
