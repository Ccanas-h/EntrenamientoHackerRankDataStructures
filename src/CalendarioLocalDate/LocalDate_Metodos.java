package CalendarioLocalDate;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class LocalDate_Metodos {

	public static void main(String[] args) {

 
	
	    LocalDate now = LocalDate.now();

	    System.out.println(now.getClass());
	    System.out.println(now.getYear());
	    now.getDayOfWeek();
	    now.getDayOfMonth();
	    now.getDayOfYear();
	    now.getMonth();
	    now.getMonthValue();
	    
	    
	    
	}

}
