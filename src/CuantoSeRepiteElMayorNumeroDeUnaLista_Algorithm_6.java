import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CuantoSeRepiteElMayorNumeroDeUnaLista_Algorithm_6 {

	public static void main(String[] args) {

		
		
		
			List<Integer> candles = new ArrayList<Integer>(Arrays.asList(3,2,1,3));
			
			
			birthdayCakeCandles(candles);
		
		}
	
    public static int birthdayCakeCandles(List<Integer> candles) {
        int sumador = 0;    
        int max = Collections.max(candles);     
        for (Integer integer : candles) {
            if (integer == max) {
                sumador++;
            }
        }   
        return sumador;  

    }

}
		

