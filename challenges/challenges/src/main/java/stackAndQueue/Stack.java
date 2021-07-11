package stackAndQueue;

public class Stack<T> {
  Node<T> top;


  public void push(T value){
    Node<T> node = new Node<>(value);

    node.next = top;
    top = node;
  }

  public String pop(){

    if (isEmpty()){
      return "The Stack is empty";
    }
    Node<T> temp = top;
    T value = temp.value;
    top = top.next;
    temp.next = null;
    return "" + value;
  }

  public String peek(){
    if (isEmpty()){
      return "The Stack is empty";
    }
    return "" + top.value;
  }

  public boolean isEmpty(){ return top == null;}

  @Override
  public String toString() {
    //find head
    Node<T> current = top;
    StringBuilder allValues = new StringBuilder();
    allValues.append("TOP -> ");
    System.out.print("TOP -> ");
    //output all values of the list
    while (current != null) {
      System.out.print("{ " + current.value + " } -> ");
      allValues.append("{ ").append(current.value).append(" } -> ");
      current = current.next;
    }
    allValues.append("NULL");
    System.out.print("NULL");
    System.out.println("");
    return allValues.toString();
  }
}
