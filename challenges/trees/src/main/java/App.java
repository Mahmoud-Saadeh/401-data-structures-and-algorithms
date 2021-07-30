public class App {
  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();

    // adds nodes to the tree
    binaryTree.setRoot(new Node(1));
    binaryTree.getRoot().setLeft(new Node(2));
    binaryTree.getRoot().setRight(new Node(3));
    binaryTree.getRoot().getRight().setLeft(new Node(10));
    binaryTree.getRoot().getRight().setRight(new Node(41));
    binaryTree.getRoot().getLeft().setLeft(new Node(4));
    binaryTree.getRoot().getLeft().setRight(new Node(8));

    System.out.println();
    System.out.println("breadth first " + binaryTree.breadthFirst(binaryTree));

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
    System.out.println(binarySearchTree.breadthFirst(binarySearchTree));


//    System.out.println();
//    System.out.println("preOrder");
//    binarySearchTree.preOrderTraverse(binarySearchTree.getRoot());

    BinaryTree binaryTree1 = new BinaryTree();
    BinaryTree binaryTree2 = new BinaryTree();

    binaryTree1.setRoot(new Node(10));
    binaryTree1.getRoot().setLeft(new Node(7));
    binaryTree1.getRoot().setRight(new Node(15));
    binaryTree1.getRoot().getLeft().setLeft(new Node(4));
    binaryTree1.getRoot().getLeft().setRight(new Node(9));
    binaryTree1.getRoot().getRight().setRight(new Node(20));
    binaryTree1.getRoot().getRight().setLeft(new Node(50));

    binaryTree2.setRoot(new Node(100));
    binaryTree2.getRoot().setLeft(new Node(70));
    binaryTree2.getRoot().setRight(new Node(150));
    binaryTree2.getRoot().getLeft().setLeft(new Node(40));
    binaryTree2.getRoot().getLeft().setRight(new Node(90));
    binaryTree2.getRoot().getRight().setRight(new Node(200));
    binaryTree2.getRoot().getRight().setLeft(new Node(200));
    binaryTree2.getRoot().getRight().getRight().setRight(new Node(200));

    System.out.println("leaves number 1 " + binaryTree1.getLeafCount(binaryTree1.getRoot()));
    System.out.println("leaves number 2 " + binaryTree1.getLeafCount(binaryTree2.getRoot()));
    System.out.println("compare " + binaryTree1.compareTwoTreesLeaves(binaryTree1, binaryTree2));
  }
}
