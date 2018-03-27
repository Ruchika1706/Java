//In this example, no explicit thread creation but even main function runs on a thread. this example is to show details of that thread
class ThreadExample {
    public static void main(String args[]) throws InterruptedException{
      
            System.out.println("Hello");
            Thread.sleep(5000); // argument to sleep is time in ms, so 5000 msec is 5 seconds sleep
            Thread.currentThread().setPriority(10); // Thread.currentThread() returns a reference to the current Thread object
        
        /*
        catch(InterruptedException e){
            System.out.println(e);
        }*/
        
        System.out.println(Thread.currentThread());// here toString is overridden to print Thread name, priority, thread group name
    }
}
