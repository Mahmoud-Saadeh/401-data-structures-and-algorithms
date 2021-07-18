package stackAndQueue;

public class Stack<T> {
  public Node<T> top;
  public int size;
  public Double maxNum = -Double.POSITIVE_INFINITY;;

  public void push(T value){
    Double valueInt = (Double) value;
    Node<T> node = new Node<>(value);

    node.next = top;
    top = node;
    size++;
    if (valueInt > maxNum){
      maxNum =  valueInt;
    }
  }

  public String pop(){

    if (isEmpty()){
      return "The Stack is empty";
    }
    Node<T> temp = top;
    T value = temp.value;
    top = top.next;
    temp.next = null;
    size--;
    if ((T) maxNum == temp.value){
      maxNum = null;
//      maxNum = (int) -Double.POSITIVE_INFINITY;
    }
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
