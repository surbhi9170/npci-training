package dsalgo;


public class Main {
	public static void main(String[] args) {


		CircualQueue q = new CircualQueue(5);

	   

	    q.enQueue(1);
	    q.enQueue(2);
	    q.enQueue(3);
	    q.enQueue(4);
	    q.enQueue(5);
	    
	    
	    
	    
	    LInkedList linkedList = new LInkedList();
        linkedList.insertAtEnd(11);
        linkedList.insertAtFront(3);
        linkedList.insertAtFront(10);
        linkedList.insert(linkedList.head.next,9);
        linkedList.sort();
        linkedList.printList();


    }

}
