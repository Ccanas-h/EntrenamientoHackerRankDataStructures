import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Matriz2D_RelojDeArena_Sumas {

	public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,1,1,0,0,0),
                Arrays.asList(0,1,0,0,0,0),
                Arrays.asList(1,1,1,0,0,0),
                Arrays.asList(0,0,2,4,4,0),
                Arrays.asList(0,0,0,2,0,0),
                Arrays.asList(0,0,1,2,4,0)

        );
		
		hourGlassSum(list);
		
		/*
		int[][] arr2 = {
				{1,1,1,0,0,0},
				{0,1,0,0,0,0},
				{1,1,1,0,0,0},
				{0,0,2,4,4,0},
				{0,0,0,2,0,0},
				{0,0,1,2,4,0}
			};
			
			
		Se recorre cada RELOJ DE ARENA de la matriz. 
		1 1 1
		  1
		1 1 1
		
		Se suman los elementos dentro de cada reloj de arena y se agrega la suma a una lista. 
		Se verifica que el recorrido no exceda el limite tanto en su fila (y) como en su columna (x)
		¿Por que? Porque la condicion es que se cumpla la suma de los elementos de los relojes de arena dentro de la matriz. 
		
		Para lograr eso, simplemente dentro del for, reducimos el recorrido maximo de fila.lengt y columna.lenght a -2 
		de ese modo, no se romperia la condicion. 
		
		       */
		
	}


	public static int hourGlassSum(List<List<Integer>> arr) {
		
		int fila = arr.size();
		int columna = arr.get(0).size();
		
		int sumador = 0; 
		
		ArrayList<Integer> sumas = new ArrayList<Integer>();
		
		for (int y = 0; y<fila-2; y++) {
			
			
			for (int x = 0; x<columna-2; x++) {
				
				sumador = arr.get(y).get(x) + arr.get(y).get(x+1) + arr.get(y).get(x+2)
											+ arr.get(y+1).get(x+1)
						 +arr.get(y+2).get(x) + arr.get(y+2).get(x+1) + arr.get(y+2).get(x+2);
							
				sumas.add(sumador);
			}
		}
		
		
		int maxNumber = Collections.max(sumas);
		
		return maxNumber;
		
		
		
	}
	
}
