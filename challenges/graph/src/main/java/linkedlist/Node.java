package linkedlist;

public class Node<T>{
  public T value;
  public Node<T> next;

  public Node(T value) {
    this.value = value;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> node) {
    next = node;
  }
}
