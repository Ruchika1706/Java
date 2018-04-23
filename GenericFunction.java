class GenericFunction {
    public static <T> boolean sameOrNot(T temp, T temp2){
        //return ((Object)temp).equals((Object)temp2);
	//if equals() overridden in the class which is passed T, that is called, 	// else if the fucntion exists in Object class, that is called.
	//If the function does not exist in Object class -> compilation Error
	// check by replacing equals() with equalsIgnoreCase()
        return temp.equals(temp2);
    }
    public static void main(String args[]){
        System.out.println(sameOrNot(new String("Ruchika"),new String("Ruchika")));
        System.out.println(sameOrNot(new Complex(3,4), new Complex(3,4)));
        System.out.println(sameOrNot(5, 5));
    }
}
class Complex {
    private int real;
    private int imaginary;
    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public boolean equals(Object temp){
        System.out.println("Hello");
        return (this.real==((Complex)temp).real)&& (this.imaginary==((Complex)temp).imaginary);
    }
}
