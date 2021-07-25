package trees;

import java.util.ArrayList;

public class BinaryTree {
  private Node root;
  public ArrayList<Integer> preOrderArr = new ArrayList<>();
  public ArrayList<Integer> inOrderArr = new ArrayList<>();
  public ArrayList<Integer> postOrderArr = new ArrayList<>();
  public Integer maxValue;

  public void preOrderTraverse(Node node) {
    if (root == null) {
      System.out.println("There is nothing in the tree");
      return;
    }

    if (node != null) {
      System.out.print(node.getKey() + " ");
      preOrderArr.add(node.getKey());

      preOrderTraverse(node.getLeft());
      preOrderTraverse(node.getRight());
    }
  }

  public void inOrderTraverse(Node node) {
    if (root == null) {
      System.out.println("There is nothing in the tree");
      return;
    }
    if (node != null) {
      inOrderTraverse(node.getLeft());

      System.out.print(node.getKey() + " ");
      inOrderArr.add(node.getKey());

      inOrderTraverse(node.getRight());
    }
  }

  public void postOrderTraverse(Node node) {
    if (root == null) {
      System.out.println("There is nothing in the tree");
      return;
    }
    if (node != null) {
      if (maxValue == null || maxValue < node.getKey()){
        maxValue = node.getKey();
      }
      postOrderTraverse(node.getLeft());
      postOrderTraverse(node.getRight());

      System.out.print(node.getKey() + " ");
      postOrderArr.add(node.getKey());
    }
  }

  public Integer maximum(){
    Node node = root;
    postOrderTraverse(node);
    return maxValue;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  public Node getRoot() {
    return root;
  }

  public ArrayList<Integer> getPreOrderArr() {
    return preOrderArr;
  }

  public ArrayList<Integer> getInOrderArr() {
    return inOrderArr;
  }

  public ArrayList<Integer> getPostOrderArr() {
    return postOrderArr;
  }
}
