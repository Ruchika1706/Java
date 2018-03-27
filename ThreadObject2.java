//Way 2 : Implement Runnable interface, override run() method. But at the end, you have to explicitly create a Thread object and associate it with current class.
class ThreadObject2 implements Runnable {
    //private String name;
    private Thread thread;
    public ThreadObject2(String name){
        thread = new Thread(this, name);//Associating thread object with current class object, by passing reference 'this' of class implementing Runnable.
        thread.start();
    }
    public static void main(String args[]) throws InterruptedException{
        ThreadObject2 t = new ThreadObject2("New Thread");
        //t.setPriority(6);
        //t.start();
        for(int i=0;i<5;i++){
            System.out.println(i);
            Thread.currentThread().sleep(5);
        }
    }
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
