package DSA;

	
	//https://www.youtube.com/watch?v=HpaDZa0ru9

public class InsertNodeAtTheHeadOfTheListNode {
	
	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {

	SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
	
	if (head == null) return new_node; //Si la lista esta vacia, retorna el elemento nuevo a la lista. 
	
	new_node.next = head; //Si el head tiene elementos, ya que ya consideramos el hecho de q fuese
				//null, pasaria TODOS LOS ELEMENTOS DEL SInglyLinkedListNode a el NEW_NODE
				//de esta forma. 
	return new_node;
	
	
	/*
	SinglyLinkedListNode temp = head;
	head = new_node; 
	head.next = temp;
	
	 return head; 
	 
	 Fijarse aca que primero creamos una SinglyListNode TEMPORAL a la cual le agregamos 
	 TODOS LOS DATOS DE LA LISTA HEAD. 
	 
	 Luego, en la misma lista HEAD. Decimos que sera igual a new_node
	 Por lo tanto, TODO LO QUE HABIA EN LA LISTA HEAD PREVIAMENTE, Se borra
	 y solo queda el elemento de new_node el cual es DATA. 
	 
	 Y despues, finalmente como guardamos los datos de head en temp, pasamos los datos 
	 de la lista head antiguos que quedaron en temp, a la nueva lista transformada de head. 
	 
	
	Esta otra forma cuando la lista que nos dan como parametro no es null, tambien sirve
	pero es menos optima y basicamente recorre cada elemento de la lista head, y la pasa
	a la lista new_node. Y deja como cabeza el elemento que nos pasaron como param DATA. 
	
	Pero es menos optima, ya que la forma de arriba, es mas directa ya que 
	se pasan todos los datos de una. 
	
	
	  
	 
	 */
	
	}
	
}
