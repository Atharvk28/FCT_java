
public class Custom_Linked_List {

// Step 1 : Node Class
static class Node {
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;
  }
}
  Node head;

  // Step 2 :  Insert at end
  public void insertAtEnd(int data){
    Node newnNode = new Node(data);

    if (head == null) {
      head = newnNode;
      return ;
    }
    Node current = head;

    while(current.next != null ){
      current = current.next;
    }
    current.next = newnNode;
  }

  // Step 3 : Insert at beginning
  public void insertAtBeginning(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  // Step 4 : delete by value
  public void deleteByValue(int value){
    if (head == null) {
      return;
    }
    if (head.data == value) {
      head = head.next;
      return;
    }
    Node current = head;
    while(current.next != null){
      if (current.next.data == value) {
        current.next = current.next.next;
        return;
      }
      current = current.next;
    }
  }

  // Step 5 : Display the linked list
  public void display(){
    Node current = head;
    while(current != null){
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    System.out.println("Linked List Implementation in Java");
    Custom_Linked_List list = new Custom_Linked_List();
    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);
    list.display();

  }

}
