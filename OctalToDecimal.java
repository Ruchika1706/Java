class OctalToDecimal {
    public static void main(String args[]){
        int x= 170;
        int decimal=0;
        int power = 1;
        int i=0;
        while(x>0){
            int rem = x%10;
            decimal = rem *(int)Math.pow(8,i) +decimal;
            x = x/10;
            i++;
        }
        System.out.println(decimal);
    }
}