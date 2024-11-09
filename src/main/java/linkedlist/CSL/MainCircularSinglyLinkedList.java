package linkedlist.CSL;

class Main {
	public static void main(String[] args) {
	System.out.println("################ Circular Linked list ###############");
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
    System.out.println("The CSLL values inserted - 5 ,4,6,7");
    csll.createCSLL(5);
    csll.insertCSLL(4, 0);
    csll.insertCSLL(6, 1);
    csll.insertCSLL(7, 8);
    System.out.println("The CSLL traversing");
    csll.traverseCSLL();
    System.out.println("The CSLL Deletion");
    csll.deleteCSLL();
    csll.traverseCSLL();
  }
}
