import BinaryTree.BinaryTree;
import BinaryTree.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
  private final HashMap<Integer, Integer> hashMap = new HashMap<>();
  private final List<Integer> intersections = new ArrayList<>();

  public static void main(String[] args) {
    App app = new App();

    BinaryTree binaryTree1 = new BinaryTree();
    BinaryTree binaryTree2 = new BinaryTree();

    // adds nodes to the tree
    binaryTree1.setRoot(new Node(1));
    binaryTree1.getRoot().setLeft(new Node(2));
    binaryTree1.getRoot().setRight(new Node(41));
    binaryTree1.getRoot().getRight().setLeft(new Node(10));
    binaryTree1.getRoot().getRight().setRight(new Node(41));
    binaryTree1.getRoot().getLeft().setLeft(new Node(4));
    binaryTree1.getRoot().getLeft().setRight(new Node(8));

    binaryTree2.setRoot(new Node(9));
    binaryTree2.getRoot().setLeft(new Node(1));
    binaryTree2.getRoot().setRight(new Node(8));
    binaryTree2.getRoot().getRight().setLeft(new Node(107));
    binaryTree2.getRoot().getRight().setRight(new Node(21));
    binaryTree2.getRoot().getLeft().setLeft(new Node(41));
    binaryTree2.getRoot().getLeft().setRight(new Node(7));

    System.out.println(app.treeIntersection(binaryTree1, binaryTree2));
  }

  public List<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2){
    if (tree1.root == null || tree2.root == null) {
      return null;
    }
    traverse(tree1.root);

    compare(tree2.root);

    return intersections;
  }

  public void traverse(Node node) {
    if (node != null) {
      int count = hashMap.get(node.getKey()) == null ? 1 : hashMap.get(node.getKey()) + 1;
      hashMap.put(node.getKey(),count);

      traverse(node.getLeft());
      traverse(node.getRight());
    }
  }

  public void compare(Node node){
    if (node != null) {
      if (hashMap.get(node.getKey()) != null){
        intersections.add(node.getKey());
      }
      compare(node.getLeft());
      compare(node.getRight());
    }
  }
}
