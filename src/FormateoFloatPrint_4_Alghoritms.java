import java.util.Arrays;
import java.util.List;

public class FormateoFloatPrint_4_Alghoritms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> lista = Arrays.asList(-4, 3, -9, 0, 4, 1);
		
		plusMinus(lista);
	}

	
	 public static void plusMinus(List<Integer> arr) {
		    // Write your code here
		        float positivo = 0; 
		        float negativo = 0; 
		        float cero = 0; 
		        
		        for (Integer integer : arr) {
		            if (integer.equals(0)){
		                cero = cero + 1;
		            }else if (integer < 0){
		                positivo = positivo + 1; 
		            }else {
		                negativo = negativo + 1; 
		            }
		        }
		        
		        System.out.printf("%.6f \n",positivo/arr.size());
		        System.out.printf("%.6f \n",negativo/arr.size());
		        System.out.printf("%.6f",cero/arr.size());

		    }

}
