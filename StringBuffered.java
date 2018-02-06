import java.lang.StringBuffer;
class StringBuffered {
    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("theSamplethethe");
        System.out.println(str.toString());
        String replace = "the";
        for(int i=0;i<str.length();) {
            if(str.indexOf(replace)!=-1) {
                int index = str.indexOf(replace);
                str.delete(index, index+replace.length());
                i = index + (replace.length()-1);
            } else {
                break;
            }
        }
        System.out.println(str);
    }
}