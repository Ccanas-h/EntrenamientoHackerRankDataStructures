import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    
    private static final String PATH = "/home/cristobalpc/batch-sp/reporte/2022/";
    private static final String PATH2 = "/home/vgonzalez/desarrollo/rendme/batch-sp/reporte/2022/";

	public static void main(String[] args) {
	    
        Calendar c = null;
        Date date = new Date ();
        c.setTime(null);
        
        c.getFirstDayOfWeek();

        
        
        System.out.println(c.getFirstDayOfWeek());
	    

	    Integer enero = 1; 
	    
	    LocalDate l = LocalDate.now();
	   // LocalDate l2 = new LocalDate(1990, 1, 1);

	    l.getMonthValue();
	    
   }

	
}