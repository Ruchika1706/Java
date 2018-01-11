class SwapAlternate {
    public static void main(String args[]){
        int a[] = {1,3,4,5,23,32,12};
        /*O/P 3 1 5 4 32 23 12*/
        /* Point of error is for even and odd number of terms in series, so
        i<a.length-1, for odd number of elements, last number need not be touched
        and for even it is already taken care*/
        for(int i=0;i<a.length-1;i=i+2){
            int temp;
            temp = a[i];
            a[i]  = a[i+1];
            a[i+1] = temp;
        }
        for(int i=0;i<a.length;i=i+1){
        System.out.println(a[i]);
        }

    }
}