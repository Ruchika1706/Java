import java.util.Random;
class RandomNumber {
    public static void main(String args[]){
        Random ob = new Random();
        for(int i=1;i<=10;i++){
            int c = ob.nextInt(25)+65;
            System.out.print((char)c);
        }
        
    }
}