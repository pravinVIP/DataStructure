package linkedlist.CDL;

class Main {
  public static void main(String[] args) {
    CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
    cdll.createCDLL(1);
    cdll.insertNode(2, 0);
    cdll.insertNode(3, 2);
    cdll.insertNode(4, 5);
    cdll.traverseCDLL();
    cdll.deleteCDLL();
    cdll.traverseCDLL();
  }
}
