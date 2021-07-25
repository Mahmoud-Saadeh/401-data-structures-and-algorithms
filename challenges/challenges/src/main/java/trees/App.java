package trees;

public class App {
  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();

    // adds nodes to the tree
    binaryTree.setRoot(new Node(1));
    binaryTree.getRoot().setLeft(new Node(2));
    binaryTree.getRoot().setRight(new Node(3));
    binaryTree.getRoot().getLeft().setLeft(new Node(4));

    System.out.println();
    System.out.println("preOrder");
    binaryTree.preOrderTraverse(binaryTree.getRoot());

    System.out.println();
    System.out.println("inOrder");
    binaryTree.inOrderTraverse(binaryTree.getRoot());

    System.out.println();
    System.out.println("postOrder");
    binaryTree.postOrderTraverse(binaryTree.getRoot());

    System.out.println();
    System.out.println("MAXIMUM >> "+binaryTree.maximum());

    // BST
    System.out.println();
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    BinarySearchTree binarySearchTree = new BinarySearchTree();

    binarySearchTree.add(23);
    binarySearchTree.add(8);
    binarySearchTree.add(42);
    binarySearchTree.add(4);
    binarySearchTree.add(16);
    binarySearchTree.add(27);
    binarySearchTree.add(85);
    binarySearchTree.add(15);
    binarySearchTree.add(22);
    binarySearchTree.add(105);

    System.out.println(binarySearchTree.contain(23));


//    System.out.println();
//    System.out.println("preOrder");
//    binarySearchTree.preOrderTraverse(binarySearchTree.getRoot());
  }
}
