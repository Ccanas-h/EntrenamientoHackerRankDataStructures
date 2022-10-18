package DSA;

class SinglyLinkedListNode {
	int data;
	SinglyLinkedListNode next;
	
	public SinglyLinkedListNode(int data) {
		super();
		this.data = data;
	}
	
}

//https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
/*
 * Basicamente el problema consiste en que tenemos un LinkedListNode con una cabeza, 
 * la cual puede ser un numero o null. 
 * Nos pide que insertemos un dato en la cola del LinkedListNode, pero si 
 * existe un dato null entre medio o en el 1er espacio (head), entonces agregamos el dato ahi 
 * y luego nos pide retornar la cabeza, es decir el 1er atributo de la linkedlistNode
 * en el return. Eso es todo. 
 */


public class InsertNodeAtTailofLinkedList {

	
	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
		
		// if (head == null) return new_node; //1ERA FORMA. 
		
		if (head == null) { //2DA FORMA. 1ERA Y 2DA FORMA SON LO MISMO. 
			head = new_node;
			return head;
		}
		
		SinglyLinkedListNode current_node = head; 
		while (current_node.next != null) {
			current_node = current_node.next;
		}
		
		current_node.next = new_node;
		return head;
		
	}
	
}
