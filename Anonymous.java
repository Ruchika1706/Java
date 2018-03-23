class Anonymous {
    public void run() {
        System.out.println("Hello");
    }
    public static void main(String args[]){
        // a is storing the address of the derived anonymous class
        Anonymous a = new Anonymous() {
            public void run() {
                // class Unknown extends Anonymous
                System.out.println("Bye");
            }
        };
        a.run(); // function overriding 
    }
}