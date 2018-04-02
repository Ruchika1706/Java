// String is predefined class name in java.lang package
// Note : java.lang package is included in every java program by default
public class String
{
    // It will not work without java.lang.String since Main thread
    // is looking for main with java.lang.String but instead found main method
    // with user defined String class
    //public static void main(String args[]) // this won't work here, compiles ine but does not run.  
    public static void main (java.lang.String[] args)
    {
        System.out.println("I got confused");
    }
}

