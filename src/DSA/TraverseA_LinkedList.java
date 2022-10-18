package DSA;

class Node {
	int data;
	Node next = null;
}

public class TraverseA_LinkedList {

	public static void main(String[] args) {

		Node node1 = new Node();
		node1.data = 1; 
		
		Node node2 = new Node();
		node2.data = 2;
		node1.next = node2;
		
		Node node3 = new Node();
		node3.data = 3;
		node2.next = node3;
		
		Node node4 = new Node();
		node4.data = 4;
		node3.next = node4;
		
		Node node5 = new Node();
		node5.data = 5;
		node4.next = node5;
		
		Node head = node1; //Aqui fijamos la cabeza del Node, el cual seria uno y que tendria
							// La herramienta NEXT que conecta con el siguiente elemento. 
			
		
		traversedLinkedList(head);
		
	}
	
	public static void traversedLinkedList(Node head) {
		
		Node temp = head; // Creamos un Node TEMPORAL, el cual ira agregando a medida que avanza
						//el While Loop, y el TEMP, mientras se cumpla condicion, 
					// Ira agregando primero el node1.data, luego el node2 y asi
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	/** FIJARSE ACA QUE ESTA FUE LA RESPUESTA EN HACKER RANK DE USAR SinglyLinkedListNode
	 *  EXACTAMENTE LO MISMO QUE ARRIBA PERO CON OTRA CLASE LINKEDLIST NODE  
	 *  
	 
	 
	static void printLinkedList(SinglyLinkedListNode head) {
        
        SinglyLinkedListNode temp = head; 

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    
    
	 */

}
