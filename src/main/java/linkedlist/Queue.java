package linkedlist;
import java.io.IOException;

class QueueOperation{
	void display() {
		Node temp=Node.getHead();
		while(temp!=null) {
			System.out.print("->"+temp.getData());
			
			temp=temp.getAddress();
		}
		System.out.println("");
	}
	
	void queue() {
		Node newNode=new llOperation().create();
		if(Node.getHead()==null) {
			Node.setHead(newNode);
		}
		else {
			Node temp= Node.getHead();
			while(temp.getAddress()!=null) {
				temp=temp.getAddress();
			}
			temp.setAddress(newNode);	
		}
	}
	
	void deQueue() {
		if(Node.getHead()==null) {
			System.out.println("No elements");
		}
		else {
			Node.setHead(Node.getHead().getAddress());
		}
	}
}

public class Queue {

	public static void main(String[] args) {
		System.out.println("###################Queue#########################");
		QueueOperation op= new QueueOperation();
		System.out.println("queue 1st value");
		op.queue();
		System.out.println("queue 2nd value");
		op.queue();
		System.out.println("queue 3rd value");
		op.queue();
		op.display();
		System.out.println("dequeue a value");
		op.deQueue();
		op.display();

	}

}
