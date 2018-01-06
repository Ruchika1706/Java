class CheckAlphaOrDigit {
    public static void main(String args[]){
        char ch = '$';
        System.out.println((ch >= 65 && ch <= 90) || (ch >=97 && ch <= 122)?1:(ch >=48 && ch<=57) ? 2 : 0);

    }
}