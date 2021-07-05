package linkedlist;

public class LinkedList<T> {
  private Node<T> head;
  private int size;

  public LinkedList(){
    this.head = null;
    this.size = 0;
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

  /**
   *
   * @param value to be added at the end of the linkedList
   */
  public void append(T value) {
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
    size++;
  }

  public void insertBefore(T value, T newValue){
    Node<T> node = new Node<>(newValue);

    boolean valueExists = includes(value);

    if (!valueExists){
      System.out.println("Value does not exist");
      return;
    }

    Node<T> current = head;

    if (current.value == value){
      node.next = head;
      head = node;
      size++;
      return;
    }

    Node<T> prevNode = current;
    while (current.value != value) {
      prevNode = current;
      current = current.next;
    }
    node.next = current;
    prevNode.next = node;
    size++;
  }

  public void insertAfter(T value, T newValue){
    Node<T> node = new Node<>(newValue);

    boolean valueExists = includes(value);

    if (!valueExists){
      System.out.println("Value does not exist");
      return;
    }

    Node<T> current = this.head;
    Node<T> nextNode = current.next;

    while (current.value != value) {
      current = nextNode;
      nextNode = nextNode.next;
    }
    node.setNext(nextNode);
    current.setNext(node);
    size++;
  }

  public String kthFromEnd(T k){
    Node<T> current = this.head;
    int count = 1;
    int value = 0;
    if (size < (int) k){
      return "the value is greater than the length of the list";
    }
    if ((int) k < 0){
      return "Can not enter a negative number";
    }
    if (size - (int) k <= 0){
      return "" + current.value;
    }
    while (current != null) {
      if (size - (int) k == count){
        value = (int) current.value;
      }
      current = current.next;
      count++;
    }
    return "" + value;
  }

  public Node<T> getHead(){
    return this.head;
  }
}
