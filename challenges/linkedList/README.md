# Challenge 5 Linked List

- [x] Create a Node class
- [x] Create a Linked List class
- [x] include a head property
- [x] insert method Adds a new node with that value to the head of the list
- [x] includes method Indicates whether that value exists as a Node’s value somewhere within the list.
- [x] to string method Returns: a string representing all the values in the Linked List, formatted as:
      "{ a } -> { b } -> { c } -> NULL"
- [x] Can successfully instantiate an empty linked list
- [x] Can properly insert into the linked list
- [x] The head property will properly point to the first node in the linked list
- [x] Can properly insert multiple nodes into the linked list
- [x] Will return true when finding a value within the linked list that exists
- [x] Will return false when searching for a value in the linked list that does not exist
- [x] Can properly return a collection of all the values that exist in the linked list

## Code Challenge: Class 06

### Whiteboard table

![summery](imagesCh6/1.png)

| Code                                   | Sudo Code                                  | Visual                                  |
| -------------------------------------- | ------------------------------------------ | --------------------------------------- |
| ![insert](imagesCh6/code1.png)         | ![insert](imagesCh6/sudoCode1.png)         | ![insert](imagesCh6/VCode1.png)         |
| ![includes](imagesCh6/code2.png)       | ![includes](imagesCh6/sudoCode2.png)       | ![includes](imagesCh6/VCode2.png)       |
| ![valuesToString](imagesCh6/code3.png) | ![valuesToString](imagesCh6/sudoCode3.png) | ![valuesToString](imagesCh6/VCode3.png) |
| ![append](imagesCh6/code4.png)         | ![append](imagesCh6/sudoCode4.png)         | ![append](imagesCh6/VCode4.png)         |
| ![insertBefore](imagesCh6/code5.png)   | ![insertBefore](imagesCh6/sudoCode5.png)   | ![insertBefore](imagesCh6/VCode5.png)   |
| ![insertAfter](imagesCh6/code6.png)    | ![insertAfter](imagesCh6/sudoCode6.png)    | ![insertAfter](imagesCh6/VCode6.png)    |

1. in the [LinkedList](src/main/java/linkedlist/LinkedList.java) file I have 6 methods:
   - insert: to insert new node at the beginning
   - includes: check if the value exist
   - valuesToString: print the values as a string
   - append: append a new node to the end
   - insertBefore: insert a new node before a given value
   - insertAfter: insert a new node after a given value
1. in the [test](src/test/java/linkedlist/LinkedListTest.java) file I have tests for:

- [x] add a node to the end of the linked list
- [x] add multiple nodes to the end of a linked list
- [x] insert a node before a node located i the middle of a linked list
- [x] insert a node before the first node of a linked list
- [x] insert after a node in the middle of the linked list
- [x] insert a node after the last node of the linked list
