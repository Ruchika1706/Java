import java.util.Random;
class RandomNumber {
    public static void main(String args[]){
        Random ob = new Random();
        /* Print a 10 character random string using A to Z */
	for(int i=1;i<=10;i++){
            int c = ob.nextInt(25)+65;
            System.out.print((char)c);
        }
        
    }
}
