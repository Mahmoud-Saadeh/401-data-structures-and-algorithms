package linkedlist;

public class App {
  public static void main(String[] args) {

    LinkedList<java.io.Serializable> List = new LinkedList<>();

    List.append(6);
    List.append(5);

    List.insert(4);
    List.insert(8);

    List.insertAfter(5,7);

    List.valuesToString();
    System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println(List.kthFromEnd(4));
    System.out.println(List.kthFromEnd(0));
  }
}
