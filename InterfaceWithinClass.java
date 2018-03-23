class InterfaceWithinClass {
    interface test {
        public void run();
        int x=10;
    }
    public static void main(String args[]){
        System.out.println("Hello");
        InterfaceWithinClass.test t = new InterfaceWithinClass.test(){
             public void run() {
                System.out.println("Haaas");
            }
        };
        t.run();
        
    }
}
class Test implements InterfaceWithinClass.test {
    public void run() {
        System.out.println("Haaas");
        
    }
}