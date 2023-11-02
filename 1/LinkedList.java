
public class LinkedList {
	static Node head;
	
		static class Node{
			int data;
			Node next;
			
				Node(int d){
					data = d;
					next = null;
				}
		}
	
		void addNode(int n) {
			Node newNode = new Node(n);
			Node current = head;
			
			if(head==null) {
				head = newNode;
			}else {
				while(current.next!=null) {
					current = current.next;
				}
				current.next = newNode;
			}
				
		}
		
		void reverseList(Node node) {
			Node prev = null;
			Node current = node;
			Node next = null;
				
				while(current!=null) {
					next = current.next;
					current.next = prev;
					prev = current;
					current = next;
				}
				head = prev;
				System.out.println();
		}
		
		void printList(Node node) {
			while(node!=null) {
				if (node.next != null)
					System.out.print(node.data + " -> ");
				else
					System.out.print(node.data);
				node = node.next;
			}
			System.out.println();
		}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
//		LinkedList.head = new Node(15);
//		LinkedList.head.next = new Node(5);
//		LinkedList.head.next.next = new Node(50);
//		list.printList(head);
//		list.reverseList(head);
//		list.printList(head);
		list.addNode(0);
		list.addNode(2);
		list.printList(head);

	}

}
