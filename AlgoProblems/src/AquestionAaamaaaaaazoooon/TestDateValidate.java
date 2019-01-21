package AquestionAaamaaaaaazoooon;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class TestDateValidate {

	public static void main(String[] args) {
System.out.println(Calendar.MONTH);
        System.out.println("isValid - dd/MM/yyyy with 20130925 = " + isValidFormat("dd-MMM-yyyy", "10-Jun-2013"));
        System.out.println("isValid - dd/MM/yyyy with 25/09/2013 = " + isValidFormat("dd/MM/yyyy", "25/09/2013"));
        System.out.println("isValid - dd/MM/yyyy with 25/09/2013 12:13:50 = " + isValidFormat("dd/MM/yyyy", "25/09/2013  12:13:50"));
    }

    public static boolean isValidFormat(String format, String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date != null;
    }
}