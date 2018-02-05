class compare {
    private String sample;
    public compare(String value){
        this.sample = value;
    }
    public int length(){
        return sample.length();
    }
    public int compareTo(String test) {
        char arr[] = this.sample.toCharArray();
        char brr[] = test.toCharArray();
        for (int i = 0; (i < arr.length); i++) {
            if (arr[i] < brr[i]) {
                return arr[i]-brr[i];
            } else if(arr[i] > brr[i]) {
                return arr[i]-brr[i];
            } else if(arr[i] == brr[i]){
                continue;
            }
        }
        if(arr.length == brr.length){
            return 0;
        }
        return this.length()-test.length();

    }
}
class compareTo {
    public static void main(String args[]){
        compare a = new compare("Strings");
        System.out.println(a.compareTo("Strings Integers"));
        System.out.println("Strings".compareTo("Strings Integers"));

    }
}