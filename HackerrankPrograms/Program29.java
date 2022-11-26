
class Node {
	public int data;
	public Node next;

	public Node(int val) {
		this.data = val;
		this.next = null;
	}
}

class SinglyLinkedList {
	public Node head;

	public SinglyLinkedList() {
		this.head = null;
	}

	public void insertNode(int val) {
		Node n = new Node(val);

		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			head = n;
			head.next = temp;
		}
	}

	public void reverse(Node llist) {
		Node currNode = head, prevNode = null, nextNode = null;
		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
	}

	public void printReverse() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}

public class Program29 {

	public static void main(String[] args) {
		SinglyLinkedList node = new SinglyLinkedList();
		node.insertNode(3);
		node.insertNode(2);
		node.insertNode(1);
		node.printReverse();
	}
}