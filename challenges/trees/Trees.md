# Trees
Data structures are used to store and organize data. We can use algorithms to manipulate and use our data structures. Different types of data are organized more efficiently by using different data structures.

Trees are non-linear data structures. They are often used to represent hierarchical data. For a real-world example, a hierarchical company structure uses a tree to organize.

## Challenge
1. Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
1. Implement a binary tree
1. Implement a binary search tree

## Whiteboard Process
![Trees](./Trees.png)

## Approach & Efficiency
1. [Binary Tree](src/main/java/trees/BinaryTree.java)
  - Time
    - inserting a new node is O(n)
    - Searching for a specific node is O(n)
  - Space
    - O(w), where w is the largest width of the tree
  - Find Maximum method
    - Time O(n)
    - Space O(1)

1. [Binary Search Tree](src/main/java/trees/BinarySearchTree.java)
  - Time
    - insertion and search operations is O(h), or O(height), In a balanced (or “perfect”) tree, the height of the tree is log(n)
  - Space
    - O(1)

## API
1. in [Binary Tree](src/main/java/trees/BinaryTree.java) there are 3 main methods excluding setters and getters
  - preOrderTraverse: to print the data as root >> left >> right
  - inOrderTraverse: to print the data as left >> root >> right
  - postOrderTraverse: to print the data as left >> right >> root
  - maximum: to search through the tree and return the max. value

1. in [Binary Search Tree](src/main/java/trees/BinarySearchTree.java) I extended the Binary Tree class and added 2 methods:
  - add => input integer: to add a new node to the tree and if the number was larger than the root go to the right and if smaller go to the left
  - contain => input integer: search the tree if the value exists and return true if it does or false if it doesn't

## Solution

1. maximum
  - populate the binary tree with some value (only integers)
  - run the maximum method in the [Binary Tree](src/main/java/trees/BinaryTree.java) class
