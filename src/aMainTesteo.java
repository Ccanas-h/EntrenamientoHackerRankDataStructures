import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class aMainTesteo {

	public static void main(String[] args) {
		

		
		String a = "1ero.2do.asda.asdas..fds.sdf.sfdg.sdg.sdg.sdgh.sdh.sd.sdf.sdf.dsf.sdf.sdf.UltimoSTRINGLOQUILLO.";
		
		
		
		String primerString = a.split("\\.")[2];
		String segundoString = a.split("\\.")[2];
		String ultimoString = a.split("\\.")[a.split("\\.").length-1];
		
		
		System.out.println(primerString);
		System.out.println(segundoString);
		System.out.println(ultimoString);

		System.out.println("Este cambio deberia cambiar la ruta del branch 99cd53e4 por otra en test2");
		
    }
	
	
}
		

