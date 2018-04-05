/* Print the current date, month and year using Calendar class in Java*/
import java.util.Calendar;
class CalendarClass {
    public static void main(String args[]){
        Calendar c = Calendar.getInstance();
        System.out.print(c.get(Calendar.DATE));
        System.out.print("-");
        System.out.print(c.get(Calendar.MONTH));
        System.out.print("-");
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c);
    }
}
