//whenever join() is applied on a Thread, gives control to it when it starts
// executing i.e. whenever it gets control, it won;t transfer the control to 
//other thread till it completes itself, even if it sleeps in between.If another
//thread has started before it, it can share, but no new thread will execute
//till this thrad stops
class Join extends Thread{
    public Join(String name){
        super(name);
    }
    public void run(){
        for(int i=6;i<=15;i++){
            System.out.println(i + " "+this.getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Join2 extends Thread{
    public Join2(String name){
        super(name);
    }
    public void run(){
        for(int i=6;i<=7;i++){
            System.out.println(i + " "+this.getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class JoinThread{
    public static void main(String args[]) throws InterruptedException{
        Join t1 = new Join("1");
        Join2 t2 = new Join2("2");
        Join t3 = new Join("3");
        t1.start();
        t2.start();
        t2.join();
        t3.start();
        
    }
}
