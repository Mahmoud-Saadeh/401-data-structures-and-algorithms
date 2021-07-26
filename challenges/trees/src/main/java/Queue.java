public class Queue {
  public NodeQueue front;
  public NodeQueue rear;
  public int size;

  public void enqueue(Node value){
    NodeQueue node = new NodeQueue(value);

    if (front == null){
      front = node;
    }else{
      rear.next = node;
    }
    rear = node;
    size++;
  }

  public Node dequeue(){
    if (isEmpty()){
      return null;
    }
    NodeQueue temp = front;
    front = front.next;
    Node value = temp.value;
    temp.next =null;
    size--;
    return value;
  }

  public Node peek(){
    if (isEmpty()){
      return null;
    }
    return front.value;
  }

  public  boolean isEmpty(){
    return front == null;
  }
  @Override
  public String toString() {
    //find head
    NodeQueue current = front;
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
