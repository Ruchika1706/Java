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
    
}
class WeightInit {
    public static void main(String args[]){
    Weight w1 = new Weight();
    Weight w2 = new Weight();
    Weight w3 = new Weight();
    w1.init();
    w2.init();
    w3.init();
    w1.display();
    w2.display();
    w3.display();
    System.out.println("Enter the gms for whose weight greater than this weight the object will be displayed");
    Scanner si = new Scanner(System.in);
    int value = si.nextInt();
    if(w1.greaterTotalGrams(value))
        w1.display();
    if(w2.greaterTotalGrams(value))
        w2.display();
    if(w3.greaterTotalGrams(value))
        w3.display();
    }
    
}