import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VariableQueIgualaAOtraFuncionalidad {

	public static void main(String[] args) {


		List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		List<Integer> copia = numeros; 
		
		copia.addAll(Arrays.asList(6,7,8,9));
		
		System.out.println(numeros);
		System.out.println();
		System.out.println(copia);
		
    }
	
	
}
		

