/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackAndQueue;

public class App {

    public static void main(String[] args) {
      Stack<java.io.Serializable> stack = new Stack<>();

      stack.push(3);
      stack.push(2);
      stack.push(1);
      stack.push(0);

      System.out.println(stack.isEmpty());

      System.out.println(stack.pop());
      System.out.println(stack.pop());
      stack.toString();
      System.out.println(stack.peek());
      System.out.println(stack.pop());

      System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

      Queue<java.io.Serializable> queue = new Queue<>();

      queue.enqueue(8);
      queue.enqueue(4);
      queue.enqueue(7);
      queue.enqueue(6);
      queue.toString();

      System.out.println(queue.dequeue());
      queue.toString();
      System.out.println(queue.dequeue());
      queue.toString();
      System.out.println("peek "+queue.peek());
      System.out.println(queue.dequeue());
      queue.toString();
      System.out.println(queue.dequeue());
      queue.toString();
      System.out.println(queue.dequeue());
      queue.toString();

    }
}