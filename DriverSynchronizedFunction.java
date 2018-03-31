/* Refer to DriverSynchronized.java for more structure details*/
class BankAccount {
        private String name;
        private double balance;
        public BankAccount(){
            this.name = null;
            this.balance = 0.0;
        }
        public BankAccount(String name, double balance){
            this.name = name;
            this.balance = balance;
        }
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
	/*
	Synchronized Function, only one Thread can be inside this function at any point in time
	Do not make depositMoney() or withdrawMoney() as synchronized won;t be helpful
	*/
        synchronized void updateBalance(String type,double money) throws CustomException,Exception{
            if(type.equalsIgnoreCase("deposit")){
                this.depositMoney(money);
            }
                else if(type.equalsIgnoreCase("withdraw")){
                    this.withdrawMoney(money);
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
        BankAccount ab;
        String transactionType;
        double amount;
         // Parameterized constructor
        public TransactionThread(){
            this.ab = null;
            this.transactionType = null;
            this.amount = 0.0;
        }
        public TransactionThread(BankAccount temp, String trans, double amount){
            this.ab = temp;// do not create new memory here. IMP
            this.transactionType = trans;
            this.amount = amount;
        }
        
        public void run() {
                System.out.println("Before" + this.getName()+ " "+ this.ab.getBalance());
                // State the activity you want to do
                 try{
                    ab.updateBalance(transactionType,this.amount);
                 }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    
                //
                System.out.println("After"+ this.getName()+" " + this.ab.getBalance());
            }
            
            
            
        }

class DriverSynchronizedFunction {
    public static void main(String args[]){
        BankAccount temp = new BankAccount("ABC",1500.0);
        TransactionThread t1 = new TransactionThread(temp,"deposit",100.0);
        TransactionThread t2 = new TransactionThread(temp,"withdraw",110.0);
        t1.start();
        t2.start();
    }
}
/* Output
BeforeThread-0 1500.0
BeforeThread-1 1500.0
AfterThread-0 1600.0
AfterThread-1 1490.0
*/
