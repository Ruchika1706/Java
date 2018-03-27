//Way 1: Extend the Thread class and create object of child class to create Thread object. Override run() method. Pass name of the thread in its constructor
class ThreadObject extends Thread {
    public ThreadObject(String name){
        super(name);
    }
    public static void main(String args[]) throws InterruptedException{
        ThreadObject t = new ThreadObject("New Thread");
        t.setPriority(6);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println(i);
            Thread.currentThread().sleep(5);
        }
    }
    //you should write the exact same function prototype. You can't write here throws InterruptedEXception. Compilation won't succeed
    public void run() {
        for(int i=50;i>=0;i--){
            System.out.println(i);
            try{
                Thread.currentThread().sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    }
