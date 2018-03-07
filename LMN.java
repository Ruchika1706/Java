class LMN {
    public static void main(String args[]){
       int x=10,y;
       try {
            y=0;
            System.out.println(x/y);
            System.out.println("Hello");
        }
        catch(NumberFormatException e){
            System.out.println("number format Exception found");
        }
        catch(Exception e){
            System.out.println("Exception found");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception found");
        }
        
        
        
    }
}