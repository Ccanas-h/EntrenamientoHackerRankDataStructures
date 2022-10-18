package DSA;

public class InsertNodeAtIndex_3 {
	
	//https://www.youtube.com/watch?v=s5jaw0x1jdw

	public static void main(String[] args) {

	}
	
	
	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, 
			int position) {
		
		SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
		SinglyLinkedListNode current_node = head; //Todo lo que pase con current_node,
											//pasara con head tmb
		
		int index = 0;
		
		while (index < position-1) {
			current_node = current_node.next;  //Aqui llega la posicion deseada, y luego
			index++;							//Sigue rellenando con el dat
		}
		
		new_node.next = current_node.next;  // CON ESTO LO QUE HACEMOS ES RELLENAR EL new_node que hasta el momento solo tiene un node que es (int data), y estamos rellenando lo que viene despues de
										//Ese INT DATA sin pasarlo a llevar a el, ni borrarlo. Y lo estamos rellenando con lo que sobro del WHILE del Current Node, ya que el Current_Node, movio su CABEZA 
										//Hasta llegar a cierto punto dado por position y luego Current_node se transformo en lo que sobro a partir de position hacia adelante
										//Es por eso que luego, le decimos con new_node.next = current_node.next que el new_node con su primero atributo Int Data, su .next despues de 
										//Int data, sera todo lo que sobre de aquella lista SingleLinkedListNode. Se entiende? Repasar video. 
		
		current_node.next = new_node;  //Y aqui, estamos finalmente rellenando la HEAD que es IGUAL QUE CURRENT_NODE, ya que IGUALAMOS LAS VARIABLES current_node = head
										//Y todo lo que pase con ellas, sera traspasado hacia la otra. 
		
		return head;  //Por eso pudimos solo hacer un return de head, ya que esta modificado y le pasara lo mismo que current_node
		
	}

}
