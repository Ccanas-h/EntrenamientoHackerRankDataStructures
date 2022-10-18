import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiferenciaAbsolutaDiagonalesMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> lista =Arrays.asList(Arrays.asList(  11, 2, 4),
												Arrays.asList(	 4, 5, 6),
												Arrays.asList(	10, 8, -12));
				

		
		diagonalDifference(lista);
		
	}
	
    public static int diagonalDifference(List<List<Integer>> arr) {
        
        int diagonal1 = 0;
        int diagonal2 = 0; 
        
        int disminuidor = arr.get(0).size()-1;
        
        for (int i = 0; i < arr.get(0).size(); i++){
           diagonal1 = diagonal1 + arr.get(i).get(i);
            
        }
        for (int x = 0; x < arr.get(0).size(); x++){
            
            diagonal2 = diagonal2 + arr.get(x).get(disminuidor);
            disminuidor--;
        }
        
        int dif = Math.abs(diagonal1 - diagonal2); 
        
        System.out.println(disminuidor);
        System.out.println(diagonal1);
        System.out.println(diagonal2);

        return dif; 
    }
	

}
