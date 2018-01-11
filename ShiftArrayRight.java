public class ShiftArrayRight {
    public static void main(String args[]){
        int a[] = {3,4,5,6,7,1};
        int temp = a[a.length-1];
        int i;
        for(i = a.length-1;i>0;i--){
            a[i] = a[i-1];
        }
        a[i] = temp;
        for(i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
