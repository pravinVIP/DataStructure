package linkedlist.DLL;

class Main {
  public static void main(String[] args) {
	System.out.println("################ Double Linked list ###############");
    DoublyLinkedList dll = new DoublyLinkedList();
    System.out.println("Insert values into DLL - 1 , 2 ,3 ,4");
    dll.createDLL(1);
    dll.insertDLL(2, 0);
    dll.insertDLL(3, 1);
    dll.insertDLL(4, 7);
    System.out.println("Traversing DLL");
    dll.traverseDLL();
    System.out.println("Deleting DLL");
    dll.deleteDLL();
    dll.traverseDLL();
  }
}
