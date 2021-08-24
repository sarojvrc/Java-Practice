package practice;

public class InsertNode {
	
	//create a Node 
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//function for InsertNode
	public Node head;
	public void InsertNode() {
		this.head = null;
	}
	public Node InsertNode(int data) {
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
	
	//print the ll
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	//driver code
	public static void main(String args[]) {
		InsertNode list = new InsertNode();
		
		list.InsertNode(78);
		list.InsertNode(451);
		list.InsertNode(78);
		list.InsertNode(451);
		list.InsertNode(78);
		list.InsertNode(451);
		list.print();
		
		System.out.println("The head is "+list.head.data);
	}

}
