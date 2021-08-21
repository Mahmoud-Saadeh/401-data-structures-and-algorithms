package stackAndQueue;

public class Queue<T> {
  public Node<T> front;
  public Node<T> rear;
  public int size;

  public void enqueue(T value){
    Node<T> node = new Node<>(value);

    if (front == null){
      front = node;
    }else{
      rear.next = node;
    }
    rear = node;
    size++;
  }

  public String dequeue(){
    if (isEmpty()){
      return "The Queue is empty";
    }
    Node<T> temp = front;
    front = front.next;
    String value = "" + temp.value;
    temp.next =null;
    size--;
    return value;
  }

  public String peek(){
    if (isEmpty()){
      return "The Queue is empty";
    }
    return "" + front.value;
  }

  public  boolean isEmpty(){
    return front == null;
  }
  @Override
  public String toString() {
    //find head
    Node<T> current = front;
    StringBuilder allValues = new StringBuilder();
    allValues.append("front -> ");
    System.out.print("front -> ");
    //output all values of the list
    while (current != null) {
      if (current.getNext() != null){
        System.out.print("{ " + current.value + " } -> ");
        allValues.append("{ ").append(current.value).append(" } -> ");
      }else {
        System.out.print("{ " + current.value + " } <- ");
        allValues.append("{ ").append(current.value).append(" } <- ");
      }

      current = current.next;
    }
    allValues.append("rear");
    System.out.print("rear");
    System.out.println("");
    return allValues.toString();
  }
}
