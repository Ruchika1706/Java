class Outer_class {
    private int data = 11;
    public void setData(int data){
        this.data = data;
    }
	/* default access specifier is default, with private you can't have reference of this calss outside of this outer class*/
     private class Inner_class {
        private int data  = 12;
        
        public void display(){
            System.out.println("Inner" + this.data);
            //Outer_class obj = new Outer_class();
            System.out.println("Outer"+ Outer_class.this.data);
        }
    }
    private Inner_class ob;
    public Outer_class(){
        this.ob = new Inner_class();
    }
    /* this has no use
    public Inner_class getReference(){
        return this.ob;
    }
	*/
    public void display(){
     // this.ob.display();
	   Outer_class.this.ob.display();
    }
}
class NestedClass {
    public static void main(String args[]){
        Outer_class obj = new Outer_class();
        //obj.setData(10);
        //Outer_class.Inner_class ob = new Outer_class().new Inner_class();
        //obj.getReference().display();
        obj.display();
    }
}
