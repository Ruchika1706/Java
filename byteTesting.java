class byteTesting {
    public static void main(String args[]){
        byte c =10;
        byte d = 15;
        double x =30.6;
        //byte a = c+d;
        //byte a = (byte)(c+d);
        // byte a = c+d;
        //byte a = c+15;
        
        //Homework: How is the answer -126?
        byte y = 120;
        y+=11;
        System.out.println(y);
        
        d+=x;
        System.out.println(d);
    }
}