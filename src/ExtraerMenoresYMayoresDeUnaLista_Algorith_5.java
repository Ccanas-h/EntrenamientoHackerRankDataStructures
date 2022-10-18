import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExtraerMenoresYMayoresDeUnaLista_Algorith_5 {

	public static void main(String[] args) {

		
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		List<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		List<Integer> arr3 = arr;
		
		
		ArrayList<Integer> mayores = new ArrayList<Integer>();
		ArrayList<Integer> menores = new ArrayList<Integer>();
		
		long sumaMayor = 0;
		long sumaMenor = 0;
		
		for (int i=0; i<4; i++) {
				
				mayores.add(Collections.max(arr));
				arr.remove(Collections.max(arr));
			}
		for (int i=0; i<4; i++) {
			
			menores.add(Collections.min(arr2));
			arr2.remove(Collections.min(arr2));
		}

			
		for (Integer integer : mayores) {
			sumaMayor += integer;
		}
		
		for (Integer integer : menores) {
			sumaMenor += integer;
		}
		
		System.out.println(sumaMenor+"  "+sumaMayor);
		
		System.out.println(arr3);
		System.out.println(arr);

		
		
		
		
		
		
		
		
		
		
		
		
		}

}
		

