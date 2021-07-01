package linkedlist;

public class Node<T>{
  public T value;
  public Node<T> next;

  public Node(T value) {
    this.value = value;
//    this.next = next;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> node) {
    this.next = node;
  }
}
