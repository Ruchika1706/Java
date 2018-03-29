//Try the output of this program with and without line 20 setDaemon() to 
//see the difference. If line 20 not done, child thread will continue even 
//when main thread has stopped however it the child thread is set to Daemon
//it will exit as soon as the parent thread exits
class DaemonThread {
    public static void main(String args[]) throws InterruptedException {
        Thread t = new Thread(new Runnable(){
            public void run(){
                try{
                    //System.out.println(this);
                    for(int i=0;i<10;i++){
                        System.out.println("Hello");
                        
                        Thread.currentThread().sleep(1000);
                    }
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        });
        System.out.println(t);
        t.setDaemon(true);
        t.start();
        Thread.sleep(5000);
        
    }
}
