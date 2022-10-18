package DSA;

public class DeleteNodeAtPosition {

	static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
		
		if (llist == null) return llist; 
		
		if (position == 0) return llist.next;
		
		int index = 0; 
		SinglyLinkedListNode currentNode = llist;
		
		while (index < position-1) { //Queremos tener un currentNode JUSTO ANTES del que vamos a eliminar u obviar, practicamente. 
			currentNode = currentNode.next;
			index++;
		}
		
		currentNode.next = currentNode.next.next;
		
		return llist; 
	}
	
	
}
