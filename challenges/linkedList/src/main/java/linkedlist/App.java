package linkedlist;

public class App {
  public static void main(String[] args) {

    LinkedList<java.io.Serializable> List = new LinkedList<>();

    List.insertAtEnd(6);
    List.insertAtEnd(5);

    List.insert("j");
    List.insert(8);

    List.valuesToString();
  }
}
