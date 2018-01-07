import java.util.Scanner;
class Denomination { 
        public static void main(String args[]) { 
                int amount; 
                int temp; 
                int count; 
                int c500 = 0, c100 = 0, c20 = 0,c10 = 0, c5 = 0, c2= 0, c1 = 0;  
                System.out.println("Enter the amount you want to express in least number of notes of different denomination:");  
                Scanner si = new Scanner(System.in); 
                amount = si.nextInt(); 
                temp = amount; 
                c500 = amount/500; 
                temp = amount%500; 
                c100 = temp/100; 
                temp = temp%100; 
                c20 = temp/20; 
                temp = temp%20; 
                c10 = temp/10; 
                temp = temp%10; 
                c5 = temp/5; 
                temp = temp%5; 
                c2 = temp/2; 
                temp = temp%2; 
                c1 = temp/1; 
                temp = temp%1; 
                count = c500+c100+c20+c10+c5+c2+c1; 
                System.out.println("The given amount" + amount + "can be expressed in " + count +" notes"); 
                System.out.println("The number of notes needed for each denomination are 500: " +c500 + " 100: " +c100 + " 20:" + c20 +" 10:" +c10+" 5:" +c5+ " 2:" + c2 + " 1:"+ c1); 
} 
}  
                