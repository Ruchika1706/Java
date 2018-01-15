class SortInsertion {
    public static void main(String args[]){
        int a[] = {5,6,7,12,3,45,1};
        System.out.println("Array before Sorting");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
        for(int j=1;j<a.length;j++){
            int key = a[j];
            int i = j-1;
            while(i>=0 && a[i]>key){
                a[i+1] = a[i];
                i = i-1;
            }
            a[i+1] = key;
        }
        System.out.println("\nSorted Array is");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
    }
}