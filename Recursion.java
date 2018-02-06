class RecursiveFunction {
    public static String replace(String original, String replaceWith){
        String target="";
        if(original.length() < 1){
            return original;
        }
        if(original.startsWith("hi")){
            ////original = replaceWith+original.substring(2);
            return replaceWith + replace(original.substring(2),replaceWith);
        }
        return original.charAt(0)+ replace(original.substring(1),replaceWith);
    }
}
class Recursion {
    public static void main(String args[]){
        System.out.println(RecursiveFunction.replace("hhihellohi","nhi"));
    }
}