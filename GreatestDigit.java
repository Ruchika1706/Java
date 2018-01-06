class GreatestDigit {
    public static void main(String args[]){
        int number = 938;
        int digit1 = number/100;
        int digit2 = number%10;
        int digit3= number/10%10;
        System.out.println(digit1 > digit2 ?(digit1 >digit3? digit1: digit3):(digit2>digit3?digit2:digit3));
        System.out.println(160<<-1);
    }
}