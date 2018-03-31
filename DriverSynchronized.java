//Class to represent the Bank Account whose same object will be simultaneously
//accessed by Two TransactionThread
class BankAccount {
        private String name;/* name of the Account*/
        private double balance;/*current balance in the account*/
        public BankAccount(){
            this.name = null;
            this.balance = 0.0;
        }
        public BankAccount(String name, double balance){
            this.name = name;
            this.balance = balance;
        }
	/*Copy Constructor to copy values from the already existing object*/
        public BankAccount(BankAccount temp){
            this.name = temp.name;
            this.balance = temp.balance;
        }
        public String getName(){
                return this.name;
        }
        public double getBalance(){
                return this.balance;
        }
        public void setName(String name) {
                this.name = name;
        }
        public void setBalance(double balance) {
                this.balance = balance;
        }
        public void depositMoney(double money) throws InterruptedException{
                /*
		We can put Thread.sleep() anywhere even if the class does
		not extend Thread. This is only to show that deposit is taking 
		time and the other thread will be waiting for this to complete
		*/
		Thread.sleep(2000);
                this.balance += money;
        }
        public void withdrawMoney(double money) throws CustomException{
                if(this.balance >= money){
                        this.balance -= money;
                }
                else {
                        throw new CustomException("Insufficient funds in the account");
                }
        }
}
class CustomException extends Exception{
        private String message;
        public CustomException(String message){
                this.message = message;
        }
        public String toString(){
                return this.message;
        }
}
class TransactionThread extends Thread {
	/*
	When we are talking about Threads sharing the resource, 
	each Thread should itself have the resource
	*/
        BankAccount ab;// An Object of BankAccount share by different Threads.
        String transactionType; //Deposit or Withdraw
        double amount; //Amount to Deposit or Withdraw
         // Parameterized constructor
        public TransactionThread(){
            this.ab = null;
            this.transactionType = null;
            this.amount = 0.0;
        }
        public TransactionThread(BankAccount temp, String trans, double amount){
            /*
	    Very Important: Do not allocate new memory here for bank account 
	    object. It is the same reference shared by multiple threads
	    */
	    this.ab = temp;// do not create new memory here. IMP
            this.transactionType = trans;
            this.amount = amount;
        }
        
        public void run() {
            // Before _____ Balance is ______
            System.out.println(this.getName() + " "+ transactionType);
            /* Only one thread can be in the synchronized block at one time*/
	    synchronized(ab) //The argument to synchronized block is the object shared between the threads 
            {
                System.out.println("Before" + this.getName()+ " "+ this.ab.getBalance());
                // State the activity you want to do
                 try{
                if(transactionType.equalsIgnoreCase("deposit")){
                    ab.depositMoney(this.amount);
                } else if(transactionType.equalsIgnoreCase("withdraw")){
                    
                        ab.withdrawMoney(this.amount);
                    }
                 }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    
                //
                System.out.println("After"+ this.getName()+" " + this.ab.getBalance());
            }
            
            
            
        }
}
class DriverSynchronized {
    public static void main(String args[]){
        BankAccount temp = new BankAccount("ABC",1500.0);
	/* Both the threads below share the same object of BankAccount*/
        TransactionThread t1 = new TransactionThread(temp,"deposit",100.0);
        TransactionThread t2 = new TransactionThread(temp,"withdraw",110.0);
        t1.start();
        t2.start();
    }
}
/* Output of the above program

Thread-0 deposit
Thread-1 withdraw // Thread 1 comes inside run(), sees synchronized block already accessed by another Thread, waits here
BeforeThread-0 1500.0
AfterThread-0 1600.0
BeforeThread-1 1600.0
AfterThread-1 1490.0
*/
