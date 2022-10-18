import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CambiarFormatoHoraManualmente_Alghoritms {

	public static void main(String[] args) {

		
		String s = "07:05:45PM";
		timeConversion(s);

    }
	
	
	
    public static String timeConversion(String s) {
    // Write your code here
    
    String newDate = "";
    
    if (s.substring(8).equalsIgnoreCase("pm")){
    	
    	
        if (s.substring(0, 2).equals("01")){
            newDate = "13:"+s.substring(3, 8);
        }else if(s.substring(0, 2).equals("02")){
            newDate = "14:"+s.substring(3, 8);
        }else if (s.substring(0, 2).equals("03")){
            newDate = "15:"+s.substring(3, 8);
        }else if (s.substring(0, 2).equals("04")){
            newDate = "16:"+s.substring(3, 8);
        }else if (s.substring(0, 2).equals("05")){
            newDate = "17:"+s.substring(3, 8);
        }else if (s.substring(0, 2).equals("06")){
            newDate = "18:"+s.substring(3, 8);
        }else if(s.substring(0, 2).equals("07")){
            newDate = "19:"+s.substring(3, 8);
        }else if (s.substring(0, 2).equals("08")){
            newDate = "20:"+s.substring(3, 8);
        }else if (s.substring(0, 2).equals("09")){
            newDate = "21:"+s.substring(3, 8);
        }else if (s.substring(0, 2).equals("10")){
            newDate = "22:"+s.substring(3, 8);
        }else if (s.substring(0, 2).equals("11")){
            newDate = "23:"+s.substring(3, 8);
        }else{
            newDate = s.substring(0,8);
        }
    }else if(s.substring(8).equalsIgnoreCase("am")){
    	
        if (s.substring(0, 2).equals("12")){
            newDate = "00:"+s.substring(3, 8);
        }else {
            newDate = s.substring(0,8);
        }
        
        
}
    System.out.println(newDate);
    return newDate;

    }

}
		

