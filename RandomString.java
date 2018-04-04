import java.util.Random;
/* ASCII A-Z 65-90 a-z 97-122 0-9 48-57*/
class RandomString {
	public static void main(String args[]){
		Random ob = new Random();
		/* Print a 10 character Random string containing uppercase, lowercase and number*/
		String str="";
		for(int i=0;i<10;i++) {
			int temp = ob.nextInt(3);
			switch(temp) {
				case 0:
					str+=(char)(ob.nextInt(26)+65);
					break;
				case 1:
					str+=(char)(ob.nextInt(26)+97);
					break;
				case 2:
					str+=ob.nextInt(10);
					break;
				default:
					break;
			}
		}


		System.out.println(str);

	}
}
