class VowelOrNot {
    public static void main(String args[]){
        char ch = 'p';
        switch(ch){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("Not a vowel");
                break;
        }
    }
}