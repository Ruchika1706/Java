/* Enter your date of birth and calculate the number of days lived so far*/
import java.util.Calendar;
class CalendarClassDaysLived {
    public static void main(String args[]){
        Calendar c = Calendar.getInstance();
        c.clear();
        c.set(1990,5,17,3,33);
        System.out.println(c);
       // int year = c.get(Calendar)
        Calendar c2 = Calendar.getInstance();
        //System.out.println();
	//getTimeInMillis() give you time from Epoch 1 Jan 1970, 00:00:00 GMT till now or the given date*/
        long diff = c2.getTimeInMillis()-c.getTimeInMillis();
        System.out.println(diff/(24*60*60*1000));
        //System.out.println(c2);
        
        
        
    }
}
