class NestedTry {
    public static void main(String args[]){
        int a=3,b=6;
        try {
            System.out.println(a/b);
            System.out.println("Hello");
            try {
                int arr[] = new int[-4];//Case with negative array size
                System.out.println(arr[10]); //case with index out of bounds
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic exception");
            }
            finally{
                System.out.println("Inside finally block");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
        finally {
            System.out.println("Inside finally block 2");
        }
        System.out.println("Bye");
    }
}