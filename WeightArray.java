import java.util.Scanner;
class Weight {
    private int kgs;
    private int gms;
    public void init(){
        System.out.println("Enter the value in gms");
        Scanner si = new Scanner(System.in);
        gms = si.nextInt();
        if(gms>=1000)
        {
            kgs = gms/1000;
            gms = gms%1000;
        }
        System.out.println("Enter the value in kgs");
        kgs += si.nextInt();
    }
    public void display(){
        System.out.println("Kgs:"+ this.kgs +" " +this.gms +"Gms");
    }
    public boolean greaterTotalGrams(int value) {
       return this.kgs*1000+this.gms > value;
    }
    public Weight greatestTotal(Weight test){
        if((this.kgs*1000+this.gms)>(test.kgs*1000+test.gms))
            return this;
        else
            return test;
    }
    
}
class WeightArray {
    public static void main(String args[]){
    System.out.println("Enter the number of Weightobjects you want to create");
    Scanner si = new Scanner(System.in);
    int count = si.nextInt();
    // Creating an array of REFERENCES initialised to null
    Weight w1[] = new Weight[count];
    for(int i=0;i<count;i++){
        w1[i] = new Weight();
        w1[i].init();
    }
    for(int i=0;i<count;i++){
        w1[i].display();
    }
    Weight greatest = w1[0];
    for(int i=1;i<count;i++){
        greatest = greatest.greatestTotal(w1[i]);
    }
    greatest.display();
    
}   
}