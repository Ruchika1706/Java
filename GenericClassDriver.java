/* Way to create object of the Type T and U without using new operator as it 
can not be used be Generic Types.*/
class GenericClass<T,U> {
    T t1;
    U t2;
    public GenericClass(T temp, U temp2){
        //String name = temp.getClass().getName();
        //System.out.println(name);
        try {
            java.lang.reflect.Constructor<?>[] c1 = temp.getClass().getConstructors();
            //finding a constrcutor which takes two integer arguments. 
            java.lang.reflect.Constructor<?> c2 = temp.getClass().getConstructor(Integer.TYPE, Integer.TYPE);
            System.out.println(c2);
            //Way to Create a new object of type T
            this.t1 = (T)c2.newInstance(3,4);
            /*
            for(java.lang.reflect.Constructor t:c1)
                System.out.println(t.newInstance(3,4));
                */
              // this.t1 = (T)c1[0].newInstance(3,4);
               //System.out.println(c1[0].getTypeParameters());
            //System.out.println(temp.getClass().newInstance());
       }
       catch(Exception e){
           System.out.println(e);
       }
       //this.t1 = temp.getClass().getConstructor()
        this.t2 = temp2;
    }
    public void getData() {
        System.out.println(this.t1+ " "+ this.t2);
    }
}
class GenericClassDriver {
    public static void main(String args[]){
        GenericClass<Complex,Integer> g1 = new GenericClass<Complex,Integer>(new Complex(3,4),5);
        g1.getData();
    }
}
class Complex {
    private int real;
    private int imaginary;
    
    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex() {
        this.real = this.imaginary = 0;
    }
    
    public boolean equals(Object temp){
        System.out.println("Hello");
        return (this.real==((Complex)temp).real)&& (this.imaginary==((Complex)temp).imaginary);
    }
    public String toString(){
        return this.real + "+i"+ this.imaginary;
    }
}
