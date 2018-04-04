import java.util.Random;
class RandomBetweenRange {
	public static void main(String args[]) {
		Random ob = new Random();
		/* Print a number the range 10-30*/
		/* Formula for range is difference between the highest and lowest + the lowest value of range*/
		/* Since ob.nextInt(20) does not include 20, I should write 21 here*/
		int m = ob.nextInt(21) + 10;
		System.out.println(m);
	}
}
