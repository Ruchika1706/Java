import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
class SimpleDate {
    public static void main(String args[]){
        SimpleDateFormat ob = new SimpleDateFormat();
        Date ob1 = new Date();
        ob.applyPattern("dd-MM-YYYY");

        System.out.println(ob.format(ob1));
        /*
        Date ob1 = new Date();
        DateFormat df = DateFormat.getDateInstance();
        df.applyPattern("d-M-Y");
        System.out.println(df);
        */
        
    }
}