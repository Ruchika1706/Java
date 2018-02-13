class OddEvenSeparateEnhancedFor {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int even[] = new int[arr.length];
        int odd[] = new int[arr.length];
        int i=0,j=0;
        for(int x:arr){
            if(x%2==0){
                even[i++]=x;
            } else {
                odd[j++] =x;
            }
        }
        for(int k:even){
            if(k!=0)
            System.out.println(k);
            else 
            break;
        }
        for(int k:odd){
            if(k!=0)
            System.out.println(k);
            else
            break;
        }
    }
}