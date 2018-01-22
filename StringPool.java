/* when string are created using double quotes, they are stored in string pool memory area unlike when created using constructor*/
class StringPool {
    public static void main(String arg[]){
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        String d = new String("Hello");
        if(a==b){
            System.out.println("In the string pool");
        } else
        {
            System.out.println("Not In the string pool");
        }
        if(c==d){
            System.out.println("In the string pool");
        }else
        {
            System.out.println("Not In the string pool");
        }
        
    }
}
