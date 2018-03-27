//Way 3, not extending Thread class, not implementing Runnable, use Anonymous class for overrding run() of Runnable. Use and pass that reference in Thread class constructor. In the end, you NEED an object of Thread class by any means.
class ThreadObject3 {
  
    public static void main(String args[]) throws InterruptedException{
        /*
        Runnable t1= new Runnable(){
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
        };
        */
        //t.setPriority(6);
        //Thread t = new Thread(t1);
        Thread t = new Thread(new Runnable(){
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
        });
        t.start();
        for(int i=0;i<5;i++){
            System.out.println(i);
            Thread.currentThread().sleep(5);
        }
    }
    
    }
