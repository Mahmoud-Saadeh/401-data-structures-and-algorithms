import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void instantiateAnEmptyTree(){
    BinaryTree binaryTree = new BinaryTree();

    assertNull("Should return null for empty tree",binaryTree.getRoot());
  }

  @Test
  public void instantiateATree0neNode(){
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.setRoot(new Node(1));

    assertEquals("should return 1 as the root value",1,binaryTree.getRoot().getKey());
  }

  @Test
  public void rootAndLeftAndRight(){
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.setRoot(new Node(1));
    binaryTree.getRoot().setLeft(new Node(2));
    binaryTree.getRoot().setRight(new Node(3));

    assertEquals("should return 2 as the left value",2,binaryTree.getRoot().getLeft().getKey());
    assertEquals("should return 3 as the right value",3,binaryTree.getRoot().getRight().getKey());
  }

  @Test
  public void preorderTraversal(){
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.setRoot(new Node(1));
    binaryTree.getRoot().setLeft(new Node(2));
    binaryTree.getRoot().setRight(new Node(3));
    binaryTree.getRoot().getLeft().setLeft(new Node(4));

    binaryTree.preOrderTraverse(binaryTree.getRoot());

    assertEquals("should return [1, 2, 4, 3]","[1, 2, 4, 3]","" + binaryTree.getPreOrderArr());
  }

  @Test
  public void inorderTraversal(){
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.setRoot(new Node(1));
    binaryTree.getRoot().setLeft(new Node(2));
    binaryTree.getRoot().setRight(new Node(3));
    binaryTree.getRoot().getLeft().setLeft(new Node(4));

    binaryTree.inOrderTraverse(binaryTree.getRoot());

    assertEquals("should return [4, 2, 1, 3]","[4, 2, 1, 3]","" + binaryTree.getInOrderArr());
  }

  @Test
  public void postorderTraversal(){
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.setRoot(new Node(1));
    binaryTree.getRoot().setLeft(new Node(2));
    binaryTree.getRoot().setRight(new Node(3));
    binaryTree.getRoot().getLeft().setLeft(new Node(4));

    binaryTree.postOrderTraverse(binaryTree.getRoot());

    assertEquals("should return [4, 2, 3, 1]","[4, 2, 3, 1]","" + binaryTree.getPostOrderArr());
  }

  @Test
  public void testMaximumBinaryTree(){
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.setRoot(new Node(6));
    binaryTree.getRoot().setLeft(new Node(2));
    binaryTree.getRoot().setRight(new Node(3));
    binaryTree.getRoot().getLeft().setLeft(new Node(4));

    assertEquals("should return 6","6" , "" + binaryTree.maximum());
  }

  @Test
  public  void  testBreadthFirst(){
    BinaryTree binaryTree = new BinaryTree();

    // adds nodes to the tree
    binaryTree.setRoot(new Node(1));
    binaryTree.getRoot().setLeft(new Node(2));
    binaryTree.getRoot().setRight(new Node(3));
    binaryTree.getRoot().getRight().setLeft(new Node(10));
    binaryTree.getRoot().getRight().setRight(new Node(41));
    binaryTree.getRoot().getLeft().setLeft(new Node(4));
    binaryTree.getRoot().getLeft().setRight(new Node(8));

    assertEquals("should return [1, 2, 3, 4, 8, 10, 41]","[1, 2, 3, 4, 8, 10, 41]","" + binaryTree.breadthFirst(binaryTree));
  }

}
