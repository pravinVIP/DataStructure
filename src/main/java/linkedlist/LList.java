package linkedlist;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	private static Node head;
	private int data;
	private Node address;
	
	Node(){}
	
	Node(int data, Node address){
		this.data = data;
		this.address = address;
	}

	public static Node getHead() {
		return head;
	}

	public static void setHead(Node head) {
		Node.head = head;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getAddress() {
		return address;
	}

	public void setAddress(Node address) {
		this.address = address;
	}
}

class llOperation {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	Node create() {
		

		int val = 0;
		try {
			System.out.println("Enter the integer value");
			val = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {

			e.printStackTrace();
		}
		
		Node newnode = new Node(val,null);
		return newnode;
	}

	int llSize() {
		int size = 0;

		Node temp = Node.getHead();
		while (temp != null) {
			size++;
			temp = temp.getAddress();
		}
		return size;
	}

	void insertBegin() {
		Node newNode = new llOperation().create();
		if (Node.getHead() == null) {
			Node.setHead(newNode);
		} else {
			newNode.setAddress(Node.getHead());
			Node.setHead(newNode);
		}

	}

	void deleteBegin() {
		if (Node.getHead() == null) {
			System.out.println("No elements");
		} else {
			Node.setHead(Node.getHead().getAddress());
		}

	}

	void deleteEnd() {
		if (Node.getHead() == null) {
			System.out.println("No elements");
		} else {
			Node temp = Node.getHead();
			while (temp.getAddress().getAddress() != null) {
				temp = temp.getAddress();
			}
			temp.setAddress(null);
		}

	}

	void deleteRandom() {
		if (Node.getHead() == null) {
			System.out.println("No elements");
		} else {
			int pos = 0;
			try {
				System.out.println("Enter the position");
				pos = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}

			Node temp = Node.getHead();
			for (int i = 2; i < pos; i++) {
				temp = temp.getAddress();
			}

			temp.setAddress(temp.getAddress().getAddress());

		}
	}

	void insertEnd() {
		Node newNode = new llOperation().create();
		if (Node.getHead() == null) {
			Node.setHead(newNode);
		} else {
			Node temp = Node.getHead();
			while (temp.getAddress() != null) {
				temp = temp.getAddress();
			}
			temp.setAddress(newNode);
		}
	}

	void insertRandom() {
		Node newNode = new llOperation().create();
		if (Node.getHead() == null) {
			Node.setHead(newNode);
		} else {
			int pos = 0;
			try {
				System.out.println("Enter the position");
				pos = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}

			Node temp = Node.getHead();
			for (int i = 2; i < pos; i++) {
				temp = temp.getAddress();
			}
			newNode.setAddress(temp.getAddress());
			temp.setAddress(newNode);

		}
	}

	void display() {
		Node temp = Node.getHead();
		while (temp != null) {
			System.out.print("->" + temp.getData());

			temp = temp.getAddress();
		}
		System.out.println("");
	}

}

public class LList {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Node.setHead(null);
		llOperation op = new llOperation();
		int firstInput, secondInput, thirdInput;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("###################Linked List########################\n");
		while (true) {
			System.out.println(
					"\n *Press 1 to Insert \n *Press 2 to Delete \n *Press 3 to Display a Node\n *Press 4 to Exit");

			firstInput = Integer.parseInt(br.readLine());
			if (firstInput == 1) {

				System.out.println("Enter where to insert the data \n 1 - Begin\n 2 - Random\n 3 - End\n");
				secondInput = Integer.parseInt(br.readLine());
				if (secondInput == 1) {
					op.insertBegin();
				} else if (secondInput == 2) {
					op.insertRandom();
				} else if (secondInput == 3) {
					op.insertEnd();
				} else {
					System.out.println("Enter the valid number");
				}

			} else if (firstInput == 2) {

				System.out.println("Enter where to delete the data \n 1 - Begin\n 2 - Middle\n 3 - End\n");
				secondInput = Integer.parseInt(br.readLine());
				if (secondInput == 1) {
					op.deleteBegin();
				} else if (secondInput == 2) {
					op.deleteRandom();
				} else if (secondInput == 3) {
					op.deleteEnd();
				} else {
					System.out.println("Enter the valid number");
				}

			}

			else if (firstInput == 3) {

				op.display();
			} else if (firstInput == 4) {
				System.out.println("Good Bye.. ");
				break;
			} else {
				System.out.println("Enter the valid number");
			}

		}

	}

}
