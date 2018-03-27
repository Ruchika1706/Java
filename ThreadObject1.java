//Another way, directly use the Thread class to create a Thread object, override run() using Anonymous class
class ThreadObject1  {
    public static void main(String args[]) throws InterruptedException{
        Thread t = new Thread("New Thread"){
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
        t.setPriority(6);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println(i);
            Thread.currentThread().sleep(5);
        }
    }
    
    }
