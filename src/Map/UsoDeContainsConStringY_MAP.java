package Map;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class UsoDeContainsConStringY_MAP {

	public static void main(String[] args) {

 
	    
	    String departamento = "DAEM";
	    
	    
	    for (Entry<String, String> e : getRBD().entrySet()) {
            
	        if (departamento.contains(e.getKey())) {
	            
	            System.out.println(departamento.contains(e.getKey()));
	        }
	        
	        if (e.getKey().contains(departamento)) {

	            System.out.println(e.getKey().contains(departamento));
	        }else {
	           // System.out.println((e.getKey().contains(departamento)));
	        }
	        
        }

	    /**El contains, sirve para verificar si un STRING es Identico a Otro STRING. Es una forma de evitar usar EQUALS, 
	     * Ya que verifica si contiene el mismo string texto en su interior. 
	     * 
	     * Ademas como se demuestra. Sirve para ambos lados. 
	     */
	    
	}
	
	
	public static Map<String, String> getRBD() {
	        Map<String, String> rbd = new HashMap<String, String>();
	        rbd.put("DAEM", "AC");
	        rbd.put("D.A.E.M.", "AC");
	        rbd.put("BIBLIOTECA P", "AC");
	        rbd.put("LICEO", "18037");
	        rbd.put("Liceo", "18037");
	        rbd.put("ProRetencion", "18037");
	        rbd.put("970", "4354");
	        rbd.put("1180", "4374");
	        rbd.put("1181", "4375");
	        rbd.put("1183", "4379");

	        return rbd;
	    }

}
