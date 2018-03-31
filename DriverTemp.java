/** 
The task is to print the following pattern in exact order and exact number of times using two threads 
and using the concept of synchronized block or function
&#42;&#47;&#42;&#47;&#42;&#47;&#42;&#47;&#42;&#47
*/
class Pattern{
        synchronized void displayPattern(String t, String isDone) throws InterruptedException{
                //If we do not pass isDone value, thread printing * remains in wait till end and the program does not terminate
		if(isDone.equalsIgnoreCase("no"))
                System.out.print(t);
                this.notify(); //If there are any other threads waiting for this resource, it can take it.
                if(isDone.equalsIgnoreCase("no")) 
                this.wait(); //Explicitly put yourself in wait state till you get notify signal
        }
}
class PrintStar extends Thread{
        Pattern p; // The object which is shared by the two Threads
        public PrintStar(Pattern p){
                this.p = p;
        }
        public void run() {
                for(int i=0;i<5;i++){
                        try {
                        p.displayPattern("*","no");
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                        
                }
                //System.out.println("Hello Star");// this thread is still hanging 
        }
}
class PrintSlash extends Thread {
        Pattern p;
        public PrintSlash(Pattern p){
                this.p = p;
        }
        public void run() {
                for(int i=0;i<5;i++){
                        try {
                        p.displayPattern("/","no");
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                }
                try {
                        p.displayPattern("/","Yes");
                        }
                        catch(Exception e){
                            System.out.println(e);
                }
               // System.out.println("Hello Slash"); // Only this thread terminates
        }
}
class DriverTemp{
        public static void main(String args[]) throws InterruptedException{
        Pattern p = new Pattern();
        PrintStar ps1 = new PrintStar(p);
        PrintSlash ps2 = new PrintSlash(p);
        ps2.start();
        ps1.start();
        
}
}
