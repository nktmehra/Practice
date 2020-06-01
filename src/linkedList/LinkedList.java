package linkedList;

public class LinkedList {
	
	Node head;
		
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data= data;
			this.next=null;
		}
	}
	
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		third.next=null;
		list.head.next=second;
		second.next=third;
		list.printList();
	}
}
