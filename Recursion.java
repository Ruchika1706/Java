class RecursiveFunction {
    public String replace(String original, String replaceWith){
        System.out.println("Original:" + original + " replaceWith: " + replaceWith);
        String target="";
        if(original.length() < 1){
            return original;
        }
        if(original.charAt(0)=='h' && original.charAt(1)=='i'){
            original = replaceWith+original.substring(2);
        }
        return original.charAt(0)+ this.replace(original.substring(1,original.length()),"new");
    }
}
class Recursion {
    public static void main(String args[]){
        RecursiveFunction temp = new RecursiveFunction();
        System.out.println(temp.replace("hihellohithere","new"));

    }
}