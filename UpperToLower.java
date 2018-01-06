class UpperToLower {
    public static void main(String args[]){
        char c = 'A';
        c = (c >= 65 && c <= 90)? c = (char)(c + 32) : (c >= 97 && c <= 122) ? c = (char)(c - 32) : c;
        System.out.println(c);
    }
}