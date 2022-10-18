package FormateoStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsandoSPLITenStrings {

	public static void main(String[] args) {
		

		
		String a = "1ero.2do.asda.asdas..fds.sdf.sfdg.sdg.sdg.sdgh.sdh.sd.sdf.sdf.dsf.sdf.sdf.UltimoSTRINGLOQUILLO.";
		
		
		
		String primerString = a.split("\\.")[0];
		String segundoString = a.split("\\.")[1];
		String quintoString = a.split("\\.")[4];
		
		String ultimoString = a.split("\\.")[a.split("\\.").length-1];
		
		
		System.out.println(primerString);
		System.out.println(segundoString);
		System.out.println(quintoString);  //Fijarse aca que como se repetia un punto, ese punto lo alojo en el 4 index, pero no mostro el punto en la syso. Lo conto como vacio. 

		System.out.println(ultimoString);
		System.out.println("************");
		System.out.println(a.split("\\.").length);

			
		
    }
	
	
}
		

