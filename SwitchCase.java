class SwitchCase {
    public static void main(String args[]){
        char ch = 'a';
        char j = ch;
        if(ch>=65&& ch<=90)
            j = (char)(ch+32);
        if(ch>=97 && ch<=122)
            j = (char)(ch-32);
        System.out.println(j);
    }
}
