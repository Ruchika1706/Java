/*Count the number of string common in the two array of strings*/
import java.util.Scanner;
class StringCommon {
    public static void main(String args[]){
        String test[] = {"hello" ,"hi", "there","yes", "no","example"};
        String sample[] = {"yes", "no","example"};
        int count = 0;
        for(int i=0;i<test.length;i++){
            for(int j=0;j<sample.length;j++){
                if(test[i].equals(sample[j])){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
