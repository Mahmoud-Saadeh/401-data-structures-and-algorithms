package trees;

public class BinarySearchTree extends BinaryTree {

  public void add(int value) {
    if (getRoot() == null) {
      setRoot(new Node(value));
    } else {
      Node current = getRoot();
      traverseAdd(current, value);
    }
  }

  public boolean contain(int value) {
    Node current = getRoot();
    return traverseContain(current, value) != null;
  }

  private Node traverseContain(Node current, int value) {
    // Base Cases: root is null or key is present at root
    if (current == null || current.getKey() == value)
      return current;

    // Key is greater than root's key
    if (current.getKey() < value)
      return traverseContain(current.getRight(), value);

    // Key is smaller than root's key
    return traverseContain(current.getLeft(), value);
  }

  private void traverseAdd(Node current, int value) {
    if (value > current.getKey()) {
      if (current.getRight() == null) {
        current.setRight(new Node(value));
      } else {
        current = current.getRight();
        traverseAdd(current, value);
      }
    } else {
      if (current.getLeft() == null) {
        current.setLeft(new Node(value));
      } else {
        current = current.getLeft();
        traverseAdd(current, value);
      }
    }
  }
}
