class powerOfTwo {
    public static void main(String args[]){
        int a =16;
        int x =0;
        //x = a + a>>1 + a>>2 + a>>3 + a>>4;
        x = a | a>>1 | a>>2 | a>>3 | a>>4;
        System.out.println(x);
        
        
    
    }
}