package stackAndQueue;

public class PseudoQueue<T> {
  Stack<T> stack1 = new Stack<>();;
  Stack<T> stack2 = new Stack<>();;
  public int size;

  public void enqueue(T value){
    stack1.push(value);
    size++;

  }

  public String dequeue() {
    if (stack2.isEmpty()) {
      if (!stack1.isEmpty()){
        while (!stack1.isEmpty()) {
          stack2.push((T) stack1.pop());
        }
      }else {
        return "The Queue is empty";
      }
    }
    size--;
    return "" + stack2.pop();
  }

  public String toStringStack2() {
    //find head
    Node<T> current = stack2.top;
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

  public String toStringStack1() {
    //find head
    Node<T> current = stack1.top;
    StringBuilder allValues = new StringBuilder();
    allValues.append("rear -> ");
    System.out.print("rear -> ");
    //output all values of the list
    while (current != null) {
      if (current.getNext() != null){
        System.out.print("{ " + current.value + " } <- ");
        allValues.append("{ ").append(current.value).append(" } <- ");
      } else {
        System.out.print("{ " + current.value + " } <- ");
        allValues.append("{ ").append(current.value).append(" } <- ");
      }

      current = current.next;
    }
    allValues.append("front");
    System.out.print("front");
    System.out.println("");
    return allValues.toString();
  }
}
