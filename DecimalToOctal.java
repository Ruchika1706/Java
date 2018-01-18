class DecimalToOctal {
    public static void main(String args[]){
        int x= 1200;
        int octal=0;
        int power = 1;
        while(x>0){
            int rem = x%8;
            octal = rem*power + octal;
            x = x/8;
            power = power*10;
        }
        System.out.println(octal);
    }
}