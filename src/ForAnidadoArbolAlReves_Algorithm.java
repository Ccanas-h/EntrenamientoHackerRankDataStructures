import java.util.Scanner;

public class ForAnidadoArbolAlReves_Algorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un numero para la escala");
		int op = sc.nextInt();
		int contador = op-1; 
		
		for (int i=0; i<op; i++) {
			for (int j=0; j<op; j++) {
			
				if (j >= contador) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
				
				
			
			}
			contador--;
			System.out.print("\n");
		}
		
		
	}

}
