package linkedlist;

public class App {
  public static void main(String[] args) {

    LinkedList<java.io.Serializable> List = new LinkedList<>();

    List.append(6);
    List.append(5);

    List.insert("j");
    List.insert(8);

    List.valuesToString();
  }
}
