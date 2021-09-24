import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateKT {

	public static void main(String[] args) {


		Date d = new Date();
		
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss SSS");
		SimpleDateFormat sd1 = new SimpleDateFormat("MM/dd/yyyy E D F w W");
		SimpleDateFormat sd2 = new SimpleDateFormat("MM/dd/yyyy E a k K z");
		
		System.out.println(sd.format(d));
		System.out.println(sd1.format(d));
		System.out.println(sd2.format(d));
		

}
}