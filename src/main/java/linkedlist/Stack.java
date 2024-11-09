package linkedlist;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class StackOperation{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

	void display() {
		Node temp=Node.getHead();
		//System.out.println(temp.getData());
		while(temp!=null) {
			System.out.print("->"+temp.getData());
			
			temp=temp.getAddress();
		}
		System.out.println("");
	}
	
	void push() {
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
	
	void pop() {
		if(Node.getHead()==null) {
			System.out.println("No elements");
		}
		else {
			Node temp= Node.getHead();
			while(temp.getAddress().getAddress()!=null) {
				temp=temp.getAddress();
			}
			temp.setAddress(null);
		}
		
	}
}

public class Stack {

	public static void main(String[] args) {
		StackOperation op= new StackOperation();
		System.out.println("###################Stack##########################");
		System.out.println("push 1st value");
		op.push();
		System.out.println("push 2nd value");
		op.push();
		System.out.println("push 3rd value");
		op.push();
		op.display();
		System.out.println("pop a value");
		op.pop();
		op.display();

	}

}
