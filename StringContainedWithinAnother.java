class StringContainedWithinAnother {
        public static void main(String args[]){
            String a = "pingpongpingpingping";
            String b = "ping";
            int count =0;
            int i=0;
            while(a.indexOf(b,i)!=-1){
                if (a.indexOf(b, i) != -1) {
                    count += 1;
                    i = a.indexOf(b, i) + b.length() ;
                }
            }
            System.out.println(count);

    }
}