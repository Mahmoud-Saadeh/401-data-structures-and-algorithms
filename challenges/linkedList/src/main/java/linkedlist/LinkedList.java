package linkedlist;

public class LinkedList<T> {
  private Node<T> head;
  private int size;

  public LinkedList(){
    this.head = null;
    this.size = 0;
//    insertAtEnd(2);
  }

  public void insertAtEnd(T value) {
    Node<T> node = new Node<>(value);
    if (this.head == null) {
      this.head = node;
    } else {
      Node<T> current = this.head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(node);
    }
    this.size++;
  }

  /**
   *
   * @param value we receive a value and insert it in the front.
   */
  public void insert(T value){
    //define the node
    Node<T> node = new Node<>(value);


    node.next = this.head;
    this.head = node;

    this.size++;
  }

  /**
   *
   * @param value this method checks to see if a value is in a linked list.
   * @return boolean
   */
  public boolean includes(T value) {

    //find the head
    Node<T> current  = this.head;

    //check each node value in the list against input value
    while (current != null) {
      if (current.value.equals(value)) {
        return true;
      } else {
        current = current.next;
      }
    }
    return false;
  }

  // this method will print the entire contents of the linked list
  public String valuesToString(){

    //find head
    Node<T> current = this.head;
    String allValues = "";
    //output all values of the list
    while (current != null) {
      System.out.print("{ " + current.value + " } -> ");
      allValues = allValues + "{ " + current.value + " } -> ";
      current = current.next;
    }
    allValues = allValues + "NULL";
    System.out.print("NULL");
    return allValues;

  }

  public Node<T> getHead(){
    return this.head;
  }
}
