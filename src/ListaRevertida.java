import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaRevertida {

	public static void main(String[] args) {

		System.out.println(listaRevertida());

	}
	
	public static List<Integer> listaRevertida(){
		
	ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,4,3,2));
	//List<Integer> b = new List.of(1,4,3,2);
	List<Integer> b = new ArrayList<Integer>(1);
	b.clear();
	
	for (int i = a.size()-1; i>=0; i--) {
		
		b.add(a.get(i));
		
	}

	return b;
	
	}
	

}
