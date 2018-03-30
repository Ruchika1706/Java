public class DaemonThread1 extends Thread
{
    public DaemonThread1(String name) {
	super(name);
    }
    public void run()
    { 
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon())
        { 
            System.out.println(this.getName() + "This is Daemon thread"); 
        } 
         
        else
        { 
            System.out.println(this.getName()+ "This is User thread"); 
        } 
    } 
     
    public static void main(String[] args) 
    { 
     
        DaemonThread1 t1 = new DaemonThread1("1");
        DaemonThread1 t2 = new DaemonThread1("2");
        DaemonThread1 t3 = new DaemonThread1("3");
        // Setting user thread t1 to Daemon
        t1.setDaemon(true);
             
        // starting all the threads 
        t1.start(); 
        t2.start(); 
        // Setting user thread t3 to Daemon
	//Important: we can't set setDaemon(true) for a thread after starting it, else we will have IllegalThreadStateException.
        t3.setDaemon(true);
        t3.start();
         
         
    } 
}
