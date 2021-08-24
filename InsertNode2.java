package practice;

public class InsertNode2 {
	
	//create a Node first
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//create a method for InsertANewNode
	public Node head;
	public void InsertANewNode() {
		this.head = null;
	}
	
	public Node InsertANewNode(int data) {
		if(head == null) {
			head = new Node(data);
		}else {
			Node node = head;
			while(node.next != null) {
				node = node.next;
			}
			node.next = new Node(data);
		}
		return head;
	}
	
	//print function
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	//driver code
	public static void main(String args[]) {
		System.out.println("The inserted linked list is ");
		InsertNode2 linkedlist = new InsertNode2();
		
		//insert a node
		linkedlist.InsertANewNode(45);
		linkedlist.InsertANewNode(475);
		linkedlist.InsertANewNode(458);
		linkedlist.InsertANewNode(475);
		
		//print the node
		linkedlist.print();
	}

}
